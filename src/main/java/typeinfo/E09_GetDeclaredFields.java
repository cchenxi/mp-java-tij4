package typeinfo;

import static net.mindview.util.Print.*;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

interface Iface {
    int i = 47;
    void f();
}

class Basee implements Iface {
    String s;
    double d;
    public void f() {
        System.out.println("Base . f");
    }
}

class Composed {
    Basee b;
}

class Derivedd extends Basee {
    Composed c;
    String s;
}

public class E09_GetDeclaredFields {
    static Set<Class<?>> alreadyDisplayed = new HashSet<Class<?>>();
    static void printClasses(Class<?> c) {
        if (c == null)
            return;

        print(c.getName());

        Field[] fields = c.getDeclaredFields();
        if (fields.length != 0) {
            print("Fields:");
        }

        for (Field field : fields) {
            Class<?> k = field.getType();
            if (!alreadyDisplayed.contains(k)) {
                printClasses(k);
                alreadyDisplayed.add(k);
            }
        }

        for (Class<?> i : c.getInterfaces()) {
            print("Interface: " + i.getName());
            printClasses(i.getSuperclass());
        }

        printClasses(c.getSuperclass());
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            print("displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1) {
                System.out.println("=============");
            }
        }
    }
}
