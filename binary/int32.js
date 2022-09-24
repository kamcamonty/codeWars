//Task description: https://www.codewars.com/kata/538dc8eb8ca4a3d1c400088f

function isInt32(int, byteLength = 32) {
    if(byteLength == null) { byteLength = 32 }
    if(typeof int != 'number' || int.toString().includes('.')) { return false; }
    if(int < -Number.MAX_VALUE || int > Number.MAX_VALUE) { return false }
    if(byteLength == 0) { return int == 0 ? true : false; }
    if(int < 0) { return byteLength == 32 ? true : false; }
    return int.toString(2).padStart(32, 0).slice(0, -byteLength).includes('1') == false;
  }