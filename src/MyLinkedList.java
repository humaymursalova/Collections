public class MyLinkedList<E> implements MyList{
    Node head;


    public int size() {
        int size = 0;
        Node n = head;
        while (n.next != null) {
            n = n.next;
            size++;
        }
        return size;
    }

    public void add(Object a) {
        Node node = new Node();
        node.data = a;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void add(int index, Object element) {
        Node node = new Node();
        node.data = element;
        node.next = null;

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void insertFirst(E element) {
        Node node = new Node();
        node.data = element;
        node.next = head;
        head = node;
    }

    public void remove(int index) {
        Node n = head;
        if (index == 0) {
            head = n.next;
            head.next = n.next.next;
        } else {
            for (int i = 1; i < index; i++) {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }

    public void remove(Object element) {
        Node n = head;
        if (head.data == element) {
            head = head.next;
            head.next = head.next.next;
        } else {
            while (n.next!=null) {
                n = n.next;
                if (n.data==element){
                    n.data=n.next.data;
                    n.next=n.next.next;
                }
            }
        }
    }


    public boolean contains(Object a) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
            if (n.data == a || head.data == a) {
                return true;
            }
        }
        return false;
    }

    public Object get(int index) {
        int a = 0;
        Node n = head;
        while (n.next != null) {
            if (a == index) {
                return (int) n.data;
            } else {
                n = n.next;
                a++;
            }
        }
        return 0;
    }

    @Override
    public Object get(Object element) {
        return null;
    }


    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    @Override
    public String toString() {
        String s = "[";
        Node n = head;
        while (n.next != null) {
            s += n.data + ",";
            n = n.next;
        }

        return s + n.data + "]";
    }
}

class Node {
    Object data;
    Node next;}