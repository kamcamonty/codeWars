//Task description: https://www.codewars.com/kata/541a354c39c5efa5fa001372

function ipToNum(ip) {
    var binary = ip.split(".").map( it => parseInt(it).toString(2).padStart(8, '0')).join('');
    return parseInt(binary, 2);
  
  }
  
  function numToIp(num) {
    return  parseInt(num).toString(2).padStart(8 * 4, '0').match(/.{1,8}/g).map( it => parseInt(it, 2)).join(".");
  }