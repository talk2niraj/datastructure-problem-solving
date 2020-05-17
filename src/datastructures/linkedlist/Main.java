package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();
        names.add("Niraj");
        names.add("Aaditya");
        names.add("Vivan");
        names.add(3, "Rahul");
        names.add(6, "Ramesh");
        names.add(6, "Ashish");

        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(100));
        System.out.println(names.get(3));
        System.out.println(names.indexOf("Ramesh"));
        System.out.println(names.contains("Ramesh"));

        names.remove(3);
        System.out.println(names.size());
        System.out.println(names);
        names.remove("Aaditya");
        System.out.println(names.size());
        System.out.println(names);
    }
}
