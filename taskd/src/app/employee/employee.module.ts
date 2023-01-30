import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployeeComponent } from './employee.component';
import { HttpClientModule } from "@angular/common/http";
import {TableModule} from 'primeng/table';
import {ButtonModule} from 'primeng/button';
import {ToastModule} from 'primeng/toast';
import {MessageService} from 'primeng/api';
import { AddEditEmployeeModule } from './add-edit-employee/add-edit-employee.module';
import {ConfirmDialogModule} from 'primeng/confirmdialog';
import {ConfirmationService} from 'primeng/api';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    EmployeeComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    TableModule,
    ButtonModule,
    AddEditEmployeeModule,
    ToastModule,
    ConfirmDialogModule,
    FormsModule
    
    
   
    
  ],
  exports:[
    EmployeeComponent
  ],
  providers:[MessageService,ConfirmationService]

})
export class EmployeeModule { }
