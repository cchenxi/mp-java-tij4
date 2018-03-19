/**
 * Copyright (C) 2006-2018 Tuniu All rights reserved
 */
package initialization;

/**
 * TODO: description
 * Date: 2018-03-18
 *
 * @author chenxi
 */
public class Dog {
    public String bark(int arg, String arg2) {
        return "barking " + arg + " -- " + arg2;
    }

    public String bark(String arg, int arg2) {
        return "howling "  + arg + " -- " + arg2;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.bark(1, "a"));
        System.out.println(dog.bark("a", 1));
    }
}
