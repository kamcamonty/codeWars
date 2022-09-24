//Task description: https://www.codewars.com/kata/52ea928a1ef5cfec800003ee
function ipToInt32(ip){
    var binary = ip.split(".").map( it => parseInt(it).toString(2).padStart(8, '0')).join('');
    return parseInt(binary, 2);
  }