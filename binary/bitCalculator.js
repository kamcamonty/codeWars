const zeroPad = (num, places) => num.padStart(places, '0');

//Task description: https://www.codewars.com/kata/52ece9de44751a64dc0001d9

function add(a,b){
  var length = a.length > b.length ?  a.length : b.length;
  const places = length + 1;
  const a1= zeroPad(a, places);
  const b1 = zeroPad(b, places);
  var result = '';
  var carry = 0;
  
  for (let i = length; i >= 0; i--) {
    var aI = a1[i] == 0 ? 0 : 1;
    var bI = b1[i] == 0 ? 0 : 1; 
    var sum = aI + bI + carry;
    carry = (sum > 1) ? 1 : 0;
    var toPrint;
    switch(sum) {
        case 3:
            toPrint = 1;
            break;
        case 2:
            toPrint = 0;
            break;
        default:
            toPrint = sum;
}
    result = toPrint + result;
  }
  return result == 0? '0' : result.replace(/^0+/, "");
};

function calculate(num1,num2){
  var sum = add(num1, num2);
  var result = 0;
  sum.split('').forEach(function(it) {result = result * 2;
                       if(it == '1') result++;});
  return result; 
}