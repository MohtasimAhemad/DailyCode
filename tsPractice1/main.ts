// function log(message)
// {
//     console.log(message);
// }
// var message= "Hello world";
// log(message);

// function doSomething()
// {
//     for(let i = 0 ; i < 5 ; i++)
//     {
//         console.log(i);
//     }
    
//     console.log('Finally: '+i)
// }

// doSomething();


// let a:number;
// let b:boolean;
// let c:string;
// let d:any;

// let e:number[]=[1,2,3];
// let f:any[]=[1,true,'a',false];

// const ColorRed=0;
// const ColorGreen=1;
// const ColorBlue=2;

// enum Color{Red=0,Green=1,Blue=2};
// let backgroundColor = Color.Red;

// Type Assertions

// let message;
// message = 'abc';
// let endsWithC = (<string>message).endsWith('c');
// let alternativeWay = (message as string).endsWith('c');

//Arrow Function

// let log = function(message)
// {
//     console.log(message);
// }

// this a arrow function like lambda expression
// let doLog = (message) => console.log(message);


// Interface

// two way
//  1.inline annotaion
// let drawPoint = (point:{x:number , y:number})=>
// {
//     //....
// }

// drawPoint({
//     x:1,
//     y:2
// })

// 2.interface

// interface Point{
//     x:number,
//     y:number
// }


// let drawPoint = (point:Point)=>
// {
//     //....
// }

// drawPoint({
//     x:1,
//     y:2
// })


//Class in typescript


// class Point{
//     x:number;
//     y:number;

//     draw()
//     {
//         console.log('X:'+ this.x +', Y:' + this.y);
//     }


 
// }


// let point =new Point();
// point.x=1;
// point.y=2;
// point.draw();


//Construcor

// class Point{
//     x:number;
//     y:number;
//     constructor(x?:number, y?:number)
//     {
//         this.x!=x;
//         this.y!=y;
//     }

//     draw()
//     {
//         console.log('X:'+ this.x +', Y:' + this.y);
//     }


 
// }


// let point =new Point();
// // point.x=1;
// // point.y=2;
// point.draw();



// Access Modifiers
// public private protected

// class Point{

//     private x:number;
//     private y:number;

//     constructor(x?:number, y?:number)
//     {
//         this.x!=x;
//         this.y!=y;
//     }

//     public draw()
//     {
//         console.log('X:'+ this.x +', Y:' + this.y);
//     }


 
// }


// let point =new Point();
// point.x=1;
// point.y=2;
// point.draw();





// Access Modifiers in Constructor Parameters
// public private protected

// class Point{

    // private x:number; remove
    // private y:number;

//     constructor(private x?:number, private y?:number)
//     {
       
//     }

//     public draw()
//     {
//         console.log('X:'+ this.x +', Y:' + this.y);
//     }


 
// }


// let point =new Point(1,2);
// point.draw();


//modules

// import { Point } from "./point";
// let point = new Point(1,2);
// point.draw();


// solve one Problem
/*
Exercise
Background 
Imagine you're working at Facebook and your job is to implement the "Like" functionality. 

When a user clicks the "Like" button below a post, the button is highlighted (to indicate that it is selected) and the number of likes is increased. 

You're going to implement this feature in Angular and for that you'll need to create a component. This component is a TypeScript class that encapsulates the data for rendering the like button (eg: the number of likes, and whether the button is in the on/off state). It also responds to user actions. So, when the user clicks the "Like" button, the number of likes should be increased and the button should be in the "selected/on" state. If the user clicks the button again, the number of likes should be decreased and the button should be in the "unselected" state. 

Spec 
For the purpose of this exercise, forget about the HTML. Your focus should be purely on defining a TypeScript class with the right members (fields, properties, methods, constructor). 

Allow the consumer of this class to pass the initial number of likes when creating an instance of this class. 

Define this class in a separate module and use it in the main module. Simulate the scenario where the user clicks the like component. Display the total number of likes and whether the button is in the selected or unselected state on the console. 


*/

import { LikeComponent } from "./like.component";

let component = new LikeComponent(10,true);
component.likesCount=2;
component.isSelected=false;
component.onClick;
console.log(`likesCount: ${component.likesCount} , isSelected: ${component.isSelected}`)