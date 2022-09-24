//Task description: https://www.codewars.com/kata/55035eb47451fb61c0000288

function okkOokOo(input){
    var mapObj = {O:"0", K:"1", ', ': '',' ': ''};
    var re = new RegExp(Object.keys(mapObj).join("|"),"gi");
    return input.toUpperCase()
        .replace(re, function(matched){ return mapObj[matched]; })
        .replace('!', '')
        .split('?')
        .map(it => String.fromCharCode(parseInt(it, 2)))
        .join('');
}