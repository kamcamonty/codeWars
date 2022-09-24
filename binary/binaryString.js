//Task description: https://www.codewars.com/kata/52654ea8e218b83553000666
function toBinaryString(number){
    if (number == 0) return '0';
    var result = '';
    var x = number;
    
    while (x > 0) {
      result = x % 2 + result;
      x = Math.floor(x / 2);
    }
    return result;
  }