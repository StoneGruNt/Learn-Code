/*Given an integer array arr and a mapping function fn, return a new array with a transformation applied to each element.

The returned array should be created such that returnedArray[i] = fn(arr[i], i).
*/


var map = function(arr, fn) {
    let ar = [];
   for(let i = 0;i<arr.length;i++){
       ar.push(fn(arr[i],i));
   }


    return ar;
   
    
};