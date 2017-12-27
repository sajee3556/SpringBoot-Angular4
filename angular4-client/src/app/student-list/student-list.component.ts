import { Component, OnInit } from '@angular/core';
import {StudentsService} from "../students/students.service";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students: Array<any>;
  constructor(private studentService: StudentsService) { }

  ngOnInit() {
    this.studentService.getAll().subscribe(
      data => {
        this.students = data;
      },
      error => console.log(error)
    )
  }

}
