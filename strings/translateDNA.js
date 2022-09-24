//Task description: https://www.codewars.com/kata/5708ef48fe2d018413000776
reverse = function(dna) { 
    return dna.split('').reverse().map(it => 'ACTG'['TGAC'.indexOf(it)]).join('');
  }
  
  decompose = function(dna, frame) {
      if(frame < 0) dna = reverse(dna);
      return dna.length < 3 ? [] : dna.slice(Math.abs(frame) -1).match(/.{1,3}/g).filter(item => item.length == 3);
  }
  
  function translateWithFrame(dna, frames=[1,2,3,-1,-2,-3]){
    if (frames.length == 0) return [];
    return frames.map(f => dna == "" ? "" : decompose(dna, f).map(codon => codons[codon]).join('')); 
  }