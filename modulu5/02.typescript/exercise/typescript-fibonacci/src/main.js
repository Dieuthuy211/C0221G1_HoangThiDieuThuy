// let a=0;
// let b=1;
// let c;
// let sum=0;
// for (let i = 1; i <= 10; i++) {
//    sum+=b;
//  console.log(b)
//     c = a + b;
//     a = b;
//     b = c;
// }
// console.log("tổng các số fibonacci :"+sum);
// de quy
function isFibonacci(number) {
    if (number <= 1) {
        return 1;
    }
    else {
        return isFibonacci(number - 1) + isFibonacci(number - 2);
    }
}
var n = 10;
var sum = 0;
for (var i = 0; i <= n; i++) {
    console.log(isFibonacci(i));
    sum += isFibonacci(i);
}
console.log("tổng các số fibonacci :" + sum);
