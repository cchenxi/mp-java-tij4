//: holding/ListIteration.java
package holding; /* Added by Eclipse.py */
import typeinfo.pets.*;
import java.util.*;

public class ListIteration {
  public static void main(String[] args) {
    List<Pet> pets = Pets.arrayList(8);
    ListIterator<Pet> it = pets.listIterator();
    while(it.hasNext())
      System.out.print(it.next() + ", " + it.nextIndex() +
        ", " + it.previousIndex() + "; ");
    System.out.println();
    // Backwards:
    while(it.hasPrevious())
      System.out.print(it.previous().id() + " ");
    System.out.println();
    System.out.println(pets);	
    it = pets.listIterator(3);
    while(it.hasNext()) {
      it.next();
      it.set(Pets.randomPet());
    }
    System.out.println(pets);

    int length = 8;
    List<Integer> list = new ArrayList<Integer>(length);
    List<Integer> list2 = new ArrayList<Integer>(length);
    for (int i = 0; i < length; i++) {
      list.add(i);
    }
    System.out.println(list);
    ListIterator<Integer> listIterator = list.listIterator(length);
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previousIndex());
      list2.add(listIterator.previous());
    }
    System.out.println(list2);
  }
} /* Output:
Rat, 1, 0; Manx, 2, 1; Cymric, 3, 2; Mutt, 4, 3; Pug, 5, 4; Cymric, 6, 5; Pug, 7, 6; Manx, 8, 7;
7 6 5 4 3 2 1 0
[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
[Rat, Manx, Cymric, Cymric, Rat, EgyptianMau, Hamster, EgyptianMau]
*///:~
