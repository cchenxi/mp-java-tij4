//: initialization/NoSynthesis.java
package initialization; /* Added by Eclipse.py */

class Bird2 {
  Bird2(int i) {}
  Bird2(double d) {}
}

class Bird3 {
    Bird3() {
        System.out.println("generate Bird3");
    }
     Bird3(String arg) {
         System.out.println("generate Bird3, " + arg);
     }
}

public class NoSynthesis {
  public static void main(String[] args) {
    //! Bird2 b = new Bird2(); // No default
    Bird2 b2 = new Bird2(1);
    Bird2 b3 = new Bird2(1.0);
    Bird3 b4 = new Bird3();
    Bird3 b5 = new Bird3("arg");
  }
} ///:~
