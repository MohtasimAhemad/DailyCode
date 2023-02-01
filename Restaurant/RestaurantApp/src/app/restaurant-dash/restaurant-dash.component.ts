import { Component } from '@angular/core';
import { FormGroup ,FormBuilder} from '@angular/forms';
import { ApiService } from '../shared/api.service';
import { RestaurantData } from './model/restaurant.model';

@Component({
  selector: 'app-restaurant-dash',
  templateUrl: './restaurant-dash.component.html',
  styleUrls: ['./restaurant-dash.component.css']
})
export class RestaurantDashComponent {

  formValue!: FormGroup;
  restaurantModelObject:RestaurantData = new RestaurantData;
  allRestaurantData: any;

  constructor(private formBuilder:FormBuilder,private api:ApiService){}
  ngOnInit(): void{
    this.formValue = this.formBuilder.group(
      {
        name:[''],
        email:[''],
        mobile:[''],
        address:[''],
        services:[''],
      }
    )
    this.getAllData()


  }

//now subscribibg our data is mapped via services

addResto()
{
  this.restaurantModelObject.name=this.formValue.value.name;
  this.restaurantModelObject.email=this.formValue.value.email;
  this.restaurantModelObject.mobile=this.formValue.value.mobile;
  this.restaurantModelObject.address=this.formValue.value.address;
  this.restaurantModelObject.services=this.formValue.value.services;

  this.api.postRestaurant(this.restaurantModelObject).subscribe(res=>{
    console.log(res);
    alert("Restaurant Records Added Successfull");
    let ref =document.getElementById('clear');
    ref?.click();
    this.formValue.reset();
    this.getAllData();
  },
  err=>{
    alert("Something went wrong!")
  }
  )
}

//get all data
getAllData()
{
  this.api.getRestaurant().subscribe(res=>{
    this.allRestaurantData=res;
  })
}

deleteResto(data:any)
{
  this.api.deleteRestaurant(data.id).subscribe(res=>{
alert("Restaurant Records Deleted")
this.getAllData();
  })
}



}
