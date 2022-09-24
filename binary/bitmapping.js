//Task description: https://www.codewars.com/kata/59f8dd1132b8b9af150001ea
const toBits = (set) => {
    var result = [];
    set = set.split("\n");
    for (var i = 0; i < 5000; i++) result[i] = 0;
    for (var i = 0; i <= set.length; i++) result[set[i]] = 1;
    return result;
  }