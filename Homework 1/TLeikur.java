// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import edu.princeton.cs.algs4.StdRandom;

public class TLeikur {
   public TLeikur() {
   }

   public static void main(String[] var0) {
      int sum = 0;
      int last = StdRandom.uniformInt(1, 7) + StdRandom.uniformInt(1, 7);
      System.out.println("Roll 1: " + last);
      sum += last;
      int count = 2;

      while(true) {
         int roll = StdRandom.uniformInt(1, 7) + StdRandom.uniformInt(1, 7);
         System.out.println("Roll " + count + ": " + roll);
         if (roll > last) {
            System.out.println("Total sum: " + sum);
            return;
         }

         sum += roll;
         last = roll;
         ++count;
      }
   }
}
