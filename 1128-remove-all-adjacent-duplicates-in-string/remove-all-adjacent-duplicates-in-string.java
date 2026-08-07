import java.util.*;

  public class Solution {
      public String removeDuplicates(String s) {
          StringBuilder sb = new StringBuilder();
          int top = -1; // stack pointer
          for (char c : s.toCharArray()) {
              if (top >= 0 && sb.charAt(top) == c) {
                  sb.deleteCharAt(top--); // pop duplicate
              } else {
                  sb.append(c);
                  top++;
              }
          }
          return sb.toString();
      }
  }
