package holding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Date: 2018-05-05
 *
 * @author chenxi
 */
public class UseQueue {
    public static void tmp(Queue<Command> commands) {
        while (commands.peek() != null) {
            commands.poll().operation();
        }
    }

    public static void main(String[] args) {
        Second second = new Second();
        tmp(second.makeQueue());
    }
}

class Command {
    String string;

    public Command(String string) {
        this.string = string;
    }

    public void operation() {
        System.out.println(string);
    }
}

class Second {
    public Queue<Command> makeQueue() {
        Queue<Command> commands = new LinkedList<Command>();
        for (int i = 0; i < 5; i++) {
            commands.offer(new Command(i + " "));
        }
        return commands;
    }
}
