package typeinfo;

import static net.mindview.util.Print.*;


class Candyy {
    static {
        print("Loading candy");
    }
}

class Gumm {
    static {
        print("loading gumm");
    }
}

class Cookiee {
    static {
        print("loading cookie");
    }
}

public class E07_CommandLoad {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                Class.forName(arg);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
