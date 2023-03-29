export class LikeComponent
{
// likeCount:number;
// isSelected:boolean;
constructor(public likesCount:number , public isSelected:boolean)
{

}

onClick()
{
    /*this is a basic implementation*/

    // if(this.isSelected)
    // {
    //     this.likesCount--;
    //     this.isSelected=false;
    // } else{
    //     this.likesCount++;
    //     this.isSelected=true;
    // }
    this.likesCount += (this.isSelected) ? -1 : +1;
    this.isSelected = !this.isSelected;

}
}