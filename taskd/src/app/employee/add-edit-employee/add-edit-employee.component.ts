import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import {MessageService} from 'primeng/api';


@Component({
  selector: 'app-add-edit-employee',
  templateUrl: './add-edit-employee.component.html',
  styleUrls: ['./add-edit-employee.component.css']
})
export class AddEditEmployeeComponent implements OnInit {
  @Input() displayAddModal:boolean=true;
  @Output() clickClose:EventEmitter<boolean>= new EventEmitter<boolean>();
  @Output() clickAdd:EventEmitter<any>= new EventEmitter<any>();

  employeeForm=this.fb.group({
    id: [0,Validators.required],
    firstName: ["",Validators.required],
    lastName: ["",Validators.required],
    eMail: ["",Validators.required],
    mobileNo: [0,Validators.required],
    salary: [0,Validators.required]
  });  

  constructor(private fb:FormBuilder, private employeeService:EmployeeService, private messageService:MessageService) { }

  ngOnInit(): void {
  }

  closeModal(){
    this.clickClose.emit(true);
    this.employeeForm.reset();
  }

  addEmployee(){
    this.employeeService.saveEmployee(this.employeeForm.value).subscribe(
      response=>{
        this.clickAdd.emit(response);
        this.employeeForm.reset();      
        this.closeModal();
        this.messageService.add({severity:'success', summary:'Success', detail:'Employee Added'});
      },
      error=>{
        this.messageService.add({severity:'error', summary:'Error', detail:'Employee Adding failed'});
        console.log('Error occured')
      }
    )

  }

 

}
