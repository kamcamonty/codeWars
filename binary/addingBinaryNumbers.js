//Task description: https://www.codewars.com/kata/55c11989e13716e35f000013

const zeroPad = (num, places) => num.padStart(places, '0');

function add(a,b){
  var length = Math.max(a.length, b.length);
  const places = length + 1;
  const a1 = zeroPad(a, places);
  const b1 = zeroPad(b, places);
  var result = '';
  var carry = 0;
  
  for (let i = length; i >= 0; i--) {
    var sum = parseInt(a1[i]) + parseInt(b1[i]) + carry;
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