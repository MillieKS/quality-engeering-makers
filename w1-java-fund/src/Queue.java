
import java.util.ArrayList;

public class Queue {

    ArrayList<String> people = new ArrayList<>();

    private void add(String name) {
        people.add(name);
    }

    private void next() {
        if (!people.isEmpty()) {
            people.remove(0);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void state() {
        System.out.println("People currently queuing: ");
        for (String person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.add("Alice");
        myQueue.add("Ali");
        myQueue.add("Albert");

        System.out.println("Initial Queue State:");
        myQueue.state();

        myQueue.next();
        System.out.println("\nQueue State after 'next':");
        myQueue.state();

    }







}

// add - which adds people to the end of the people ArrayList
// next - which gets and removes the first person in the people ArrayList
// state - which prints a list of all the people who are currently queuing