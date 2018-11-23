import { Injectable } from '@angular/core';
import {Observable} from "rxjs/index";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('http://localhost:8080/students');
  }

  getStudentById(userId)  {
    return this.http.get('http://localhost:8080/students/'+userId);
  }

  // addStudent(data){
  //   return this.http.post('http://localhost:8080/students',JSON.stringify(data));
  // }

  getUsers() {
    return this.http.get('http://localhost:8080/students');
  }
}
