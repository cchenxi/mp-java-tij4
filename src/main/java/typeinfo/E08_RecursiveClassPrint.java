package typeinfo;

import static net.mindview.util.Print.*;

public class E08_RecursiveClassPrint {
    static void printClasses(Class<?> c) {
        if (c == null)
            return;

        print(c.getName());

        for (Class<?> i : c.getInterfaces()) {
            print("Interface: " + i.getName());

            printClasses(i.getSuperclass());
        }

        printClasses(c.getSuperclass());
    }

    public static void main(String[] args) throws Exception {
        printClasses(Class.forName("typeinfo.toys.FancyToy"));
    }
}
