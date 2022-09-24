//Task description: https://www.codewars.com/kata/5b2be37991c7460d17000009

import java.util.Arrays;
import java.security.InvalidParameterException;

public class StringPacket {
    private static final int INST_LEN = 4;
    
    public static String communicationModule(String packet) {
      String[] bytes = packet.split("(?<=\\G.{" + INST_LEN + "})");
      int a = Integer.parseInt(bytes[2]);
      int b = Integer.parseInt(bytes[3]);
      int result;
      
      switch(bytes[1]) {
        case "0F12":
          result = a + b;
          break;
        case "B7A2":
          result = a - b;
          if (result < 0) { result = 0; }
          break;
        case "C3D9":
          result = a * b;
          break;
        default:
          throw new InvalidParameterException("Unknown instruction: " + bytes[1] );
      }

      if (result > 9999) { result = 9999; }

      StringBuilder builder = new StringBuilder(bytes[0])
        .append("F".repeat(INST_LEN))
        .append(String.format("%0" + INST_LEN + "d", result))
        .append("0".repeat(INST_LEN))
        .append(bytes[bytes.length - 1]);
      
      return builder.toString();
    }
    
}