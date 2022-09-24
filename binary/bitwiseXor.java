//Task description: https://www.codewars.com/kata/56d3e702fc231fdf72001779
import java.math.BigInteger;

public class BinarySxore {
  public static BigInteger sxore (BigInteger n) {
    int rem = n.remainder(BigInteger.valueOf(4)).intValue();
  
    switch(rem) {
        case 1:
            return BigInteger.ONE;
        case 2:
            return n.add(BigInteger.ONE);
        case 3:
            return BigInteger.ZERO;
        default:
          return n;
    }
  }
}