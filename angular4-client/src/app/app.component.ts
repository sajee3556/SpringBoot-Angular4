import { Component } from '@angular/core';
import {StudentsService} from "./students/students.service";
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  basicInfoForm = new FormGroup ({
    id: new FormControl(),
    name: new FormControl(),
    department: new FormControl()
  });

  constructor(private studentService: StudentsService) { }
  student
  myObject = {
    gender: 'male',
    age: 33,
    location: 'USA'
  };
  title = 'app';
  buttonStatus = false;

  ngOnInit() {
    this.studentService.getStudentById().subscribe(
      data => {
        this.student = data;
      },
      error => console.log(error)
    )
  }

  myEvent(event) {
    console.log("Event is work");
  }

  onFormSubmit() {

      this.student = this.basicInfoForm.value;
      console.log(this.student);
      /* Any API call logic via services goes here */
    this.studentService.addStudent(this.student).subscribe();

  }
}
