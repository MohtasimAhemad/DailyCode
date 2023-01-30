import { Component, OnInit } from '@angular/core';
import { ConfirmationService, MessageService } from 'primeng/api';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
  
})
export class EmployeeComponent implements OnInit {

  employee: Employee[] =[];
  displayAddModal= false;
 

  constructor( private employeeService:EmployeeService, private confirmationService:ConfirmationService, private messageService:MessageService) { }

  ngOnInit(): void {
   
    this.getEmployeeList();
  }
  private getEmployeeData() {
    this.employeeService.getEmployeeData().subscribe(data => {
      this.employee = data;
    });
  }

  getEmployeeList(){
    this.employeeService.getEmployees().subscribe(
      response=>{
        this.employee=response;
      }
    )  
  }

  showAddModal(){
    this.displayAddModal=true;

  }
  hideAddModal(isClosed:boolean){
    this.displayAddModal=!isClosed;
  }

  loadAPIAgain(){
    return this.getEmployeeList();
  }

  deleteEmployee(employee:Employee){
    this.confirmationService.confirm({
      message: 'Are you sure that you want to remove this employee?',
      accept: () => {
        this.employeeService.deleteEmployee(employee.id).subscribe(
          response=>{
            this.messageService.add({severity:'success', summary:'Success', detail:'Deleted successfully'});
            this.getEmployeeList();
          },
          error=>{
            this.messageService.add({severity:'success', summary:'Success', detail:'Error'});
          }
        )
      }
  });
  }

  onRowEditInit(employee:Employee){
    console.log(employee);
    console.log('Edit Init Event Called');

  }

  onRowEditSave(employee:Employee){
    console.log(employee);
    this.employeeService.updateEmployee(employee).subscribe(
      response=>{
        this.messageService.add({severity:'success', summary:'Success', detail:'updated successfully'});
        this.getEmployeeList();
      },
      error=>{
        this.messageService.add({severity:'success', summary:'Success', detail:'Error'});
      })
    console.log('SaveInit Event Called');

  }

  onRowEditCancel(employee:Employee){
    console.log(employee);
    
    console.log('Edit Cancel Event Called');
  }


}
