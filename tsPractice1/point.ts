export class Point{

    
    
    constructor(private x?:number, private y?:number)
    {
      
    }

    public draw()
    {
        console.log('X:'+ this.x +', Y:' + this.y);
    }
}