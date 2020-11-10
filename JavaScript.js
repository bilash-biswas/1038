var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var X = parseInt(lines.shift());
var Y = parseInt(lines.shift()); 
var A,B,C,D,E;
switch(X)
{
case 1:
    A = 4.00 * Y;
    console.log("Total: R$ " + A.toFixed(2));
    break;
case 2:
    B = 4.50 * Y;
    console.log("Total: R$ " + B.toFixed(2));
    break;
case 3:
    C = 5.00 * Y;
    console.log("Total: R$ " + C.toFixed(2));
    break;
case 4:
    D = 2.00 * Y;
    console.log("Total: R$ " + D.toFixed(2));
    break;
case 5:
    E = 1.50 * Y;
    console.log("Total: R$ " + E.toFixed(2));
    break;
}
