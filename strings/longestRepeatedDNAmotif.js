//Task description: https://www.codewars.com/kata/5713a7ff8807941cf7000a13
const largestDistance = (arr) => {
    var pairs = [];
    for(j = 0; j < arr.length; j++)
        for (i = j; i < arr.length -1; i++) {
            pairs.push(arr[i + 1] - arr[j]);
        }
      return pairs.sort().pop();
  }
  
  const isRepeated = (sequence, motif) => {
    var indexes = [];
    for (i = 0; i < sequence.length; i++) {
        if (sequence.substring(i, i + motif.length) == motif) indexes.push(i);
      }
    return largestDistance(indexes) >= motif.length;
  }
  
  const longestMotif = (seq) => {
      var result = [];
      for (let len = seq.length; len > 0; len--) {
        for (let i = 0; i <= seq.length - len; i++) {
                  var motif = seq.substr(i, len);
                  if(isRepeated(seq, motif)) result.push(motif);
        }
        if (result.length > 0) break;
      }
      return result.filter((item, i, ar) => ar.indexOf(item) === i);
  }