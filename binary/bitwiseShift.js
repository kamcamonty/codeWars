//Task description: https://www.codewars.com/kata/523fba59cb9aaaef4f000135 
Number.prototype.twos = function(n) {
    var sign = this < 0 ? 1 : 0;
    return this.toString(2).replace('-', '').padStart(n, sign);
  }