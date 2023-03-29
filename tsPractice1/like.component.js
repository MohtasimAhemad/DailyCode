"use strict";
exports.__esModule = true;
exports.LikeComponent = void 0;
var LikeComponent = /** @class */ (function () {
    // likeCount:number;
    // isSelected:boolean;
    function LikeComponent(likesCount, isSelected) {
        this.likesCount = likesCount;
        this.isSelected = isSelected;
    }
    LikeComponent.prototype.onClick = function () {
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
    };
    return LikeComponent;
}());
exports.LikeComponent = LikeComponent;
