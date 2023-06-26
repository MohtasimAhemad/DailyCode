import { Component, OnInit } from '@angular/core';
import { Root } from './model/weather.model';

import { WeatherService } from './sevices/weather.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{


  constructor(private weatherService : WeatherService){

  }
  cityName:string='mumbai';
  root?:Root;

  ngOnInit(): void {
    this.getWeatherData(this.cityName);
    this.cityName='';

  }

  onSubmit(){
           this.getWeatherData(this.cityName);
           this.cityName='';
  }


private getWeatherData(cityName:string){
  this.weatherService.getWeatherData(cityName)
    .subscribe({
      next:(response)=>{
        this.root =response;
        console.log(response);
      }
    });
}
}
