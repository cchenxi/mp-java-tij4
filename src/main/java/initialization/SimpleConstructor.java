//: initialization/SimpleConstructor.java
package initialization; /* Added by Eclipse.py */
// Demonstration of a simple constructor.

class Rock {
  Rock() { // This is the constructor
    System.out.print("Rock ");
  }
}

class RockX {
    private String str;

    public String getStr() {
        return str;
    }

    public RockX() {
        System.out.println(getStr());
    }
}

class RockY {
    private String a = "a";
    private String b;
    {
        System.out.println(a + b);
    }

    public RockY() {
        b = "b";
        System.out.println(a + b);
    }
}

public class SimpleConstructor {
  public static void main(String[] args) {
      new RockX();
      new RockY();
    for(int i = 0; i < 10; i++)
      new Rock();
  }
} /* Output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
*///:~
