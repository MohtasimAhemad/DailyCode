import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor( private http:HttpClient) { }

  getEmployees():Observable<Employee[]>{
    return this.http.get<Employee[]>('http://localhost:3000/Employee');
  }

  saveEmployee(postData:any){
    return this.http.post("http://localhost:3000/Employee",postData);
  }

  deleteEmployee(id:number){
    return this.http.delete(`http://localhost:3000/Employee/${id}`);

  }
  
  
  public getEmployeeData() : Observable<Employee[]>{
    let url = "http://localhost:3000/Employee";
    return this.http.get<Employee[]>(url);
  }

  updateEmployee(employee:Employee){
    return this.http.put(`http://localhost:3000/Employee/${employee.id}`,employee);

  }
}
