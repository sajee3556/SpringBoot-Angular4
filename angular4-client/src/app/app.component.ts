import { Component } from '@angular/core';
import {StudentsService} from "./students/students.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

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
}
