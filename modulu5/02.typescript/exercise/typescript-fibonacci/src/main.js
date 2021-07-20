var a = 0;
var b = 1;
var c;
var sum = 0;
for (var i = 1; i <= 10; i++) {
    sum += b;
    console.log(b);
    c = a + b;
    a = b;
    b = c;
}
console.log("tổng các số fibonacci" + sum);
