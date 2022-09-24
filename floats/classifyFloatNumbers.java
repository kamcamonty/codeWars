//Task description: https://www.codewars.com/kata/5f1ab7bd5af35f000f4ff875

import org.apache.commons.lang3.StringUtils;

public class Solution {
    private static final int EXP_LENGTH = 11;
    private static final int MANTISSA_LENGTH = 52;
    
    private static String[] doubleToIEEE_754(final double d) {
      final long n = Double.doubleToRawLongBits(d);
      final StringBuilder sb = new StringBuilder(String.format("%64s", Long.toBinaryString(n)).replace(' ', '0'));
      sb.insert(EXP_LENGTH + 1, ",");
      sb.insert(1, ",");
      return sb.toString().split(",");
  }
  
    public static FloatTypeEnum getNumberType(double d) {
      String[] converted = doubleToIEEE_754(d);
      boolean sign = converted[0].equals("1");
      
      switch(converted[1]) {
        case "00000000000":
          if(!converted[2].contains("1"))
            { return sign? FloatTypeEnum.NEGATIVE_ZERO : FloatTypeEnum.POSITIVE_ZERO; }
          return sign? FloatTypeEnum.NEGATIVE_DENORMALIZED : FloatTypeEnum.POSITIVE_DENORMALIZED;
        case "11111111111":
          if(!converted[2].contains("1"))
            { return sign? FloatTypeEnum.NEGATIVE_INFINITY : FloatTypeEnum.POSITIVE_INFINITY; }
          if(converted[2].startsWith("0"))
            { return sign? FloatTypeEnum.NEGATIVE_SIGNALING_NAN : FloatTypeEnum.POSITIVE_SIGNALING_NAN; }
          return sign? FloatTypeEnum.NEGATIVE_QUIET_NAN : FloatTypeEnum.POSITIVE_QUIET_NAN;
        default:
          return sign? FloatTypeEnum.NEGATIVE_NORMALIZED : FloatTypeEnum.POSITIVE_NORMALIZED;
      }

    }
}
