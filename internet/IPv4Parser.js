//Task description: https://www.codewars.com/kata/556d120c7c58dacb9100008b

function ipv4Parser(ip, mask){
    var maskBytes = mask.split(".");
    var host = [];
    var network = ip.split(".").map((it, i) => {
      var ipByte =  parseInt(it);
      var hostByte = ipByte & ~parseInt(maskBytes[i]);
      host.push(hostByte);
      return ipByte - hostByte;
    });
    return [network.join("."), host.join(".")];
  }