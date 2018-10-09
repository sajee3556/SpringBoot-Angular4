import {Injectable} from '@angular/core';
import {Observable} from "rxjs/Observable";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class StudentsService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('http://localhost:8080/students');
  }

  getStudentById() : Observable<any> {
    return this.http.get('http://localhost:8080/students/3');
  }

  addStudent(data){
    return this.http.post('http://localhost:8080/students',JSON.stringify(data));
  }
}
