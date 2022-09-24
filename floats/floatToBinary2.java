//Task description: https://www.codewars.com/kata/5efcaedf95d7110017896ced

import java.lang.Long;
import org.apache.commons.lang3.StringUtils;

public class Solution {
  
  public static String binnarySb(String converted, int expPlaces, double number) {
    int places = expPlaces == 11? 64 : 32;

    StringBuilder sb = new StringBuilder(converted);

    if (1 / number > 0 || number == Double.POSITIVE_INFINITY ||
        (Double.isNaN(number) && converted.length() == places - 1))
        { sb.insert(0, '0'); }
    
    int actualLength = sb.toString().length();
    if (actualLength < places )
        { sb.insert(1, StringUtils.repeat('0', places - actualLength)); }  
    
    sb.insert(1, ' ');
    sb.insert(expPlaces + 2, ' ');
      
    return sb.toString();
  }
  
  public static String doubleToIEEE_754(double number) {
      String converted = Long.toBinaryString(Double.doubleToRawLongBits(number));    
      return  binnarySb(converted, 11, number);
  }

  public static String floatToIEEE_754(float number) {
      String converted = Integer.toBinaryString(Float.floatToRawIntBits(number));    
      return  binnarySb(converted, 8, number);
  }
}