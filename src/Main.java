import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();

        MyList<String> list1=new MyArrayList();

        list.add(5);
        list.add(true);
        list.add("Java");

        list1.add("Java");
        list1.add("Hello");
        list1.add("World");

        System.out.println(list);
        System.out.println(list1);

        list.add(3,20);
        list1.add(3,"Lesson");

        System.out.println(list);
        System.out.println(list1);

        System.out.println("size = "+list.size());
        System.out.println("size1 = "+list1.size());

        System.out.println(list.contains(100));
        System.out.println(list1.contains("Salam"));

        System.out.println(list.get(6));
        System.out.println(list1.get("Hello"));

        list.remove(0);
        list1.remove("Java");
        System.out.println(list);
        System.out.println(list1);

        list.add("anything");


    }
}