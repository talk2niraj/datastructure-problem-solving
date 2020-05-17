package loopinlinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedListWithLoops<String> names = new LinkedListWithLoops<String>();
        names.add("Niraj");
        names.add("Aaditya");
        names.add("Vivan");
        names.add("Rahul");
        names.add("Ramesh");
        names.add("Ashish");

        names.makeALoop(4);
        names.detectLoop();
    }
}
