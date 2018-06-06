package typeinfo;

import java.util.Iterator;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.TypeCounter;
import static net.mindview.util.Print.*;

public class E12_CoffeeCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for (Iterator<Coffee> it = new CoffeeGenerator(20).iterator(); it.hasNext(); ) {
            Coffee coffee = it.next();
            printnb(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        print();
        print(counter);
    }
}
