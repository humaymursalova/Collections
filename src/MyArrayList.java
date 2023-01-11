import java.util.Arrays;

public class MyArrayList<E> implements MyList {

    private static int INITIAL_CAPACITY = 3;
    private Object[] array;
    private int index = 0;

//    [5,-,-,-,-,-,-,-,-,10,]
//    [5,-,-,-,-,-,-,-,-,10,-,-,-,-,-,-,-,-,]

    public MyArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
    }

    public void add(Object a) {
        if (index == INITIAL_CAPACITY) {
            INITIAL_CAPACITY = array.length * 2;
            Object[] array2 = new Object[INITIAL_CAPACITY];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
//        else if (index < INITIAL_CAPACITY)
//        {
        array[index] = a;
        index++;
//        }
    }

    void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object get(Object element) {
        return null;
    }


    @Override
    public void add(int index, Object element) {

    }

    @Override
    public int size() {
        return index;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = index - 1;
                for (int j = i; j < index; j++) {
                    array[j] = array[j + 1];
                }
                break;
            }
        }
    }

    public void remove(int index1) {
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                index = index - 1;
                for (int j = i; j <= index; j++) {
                    array[j] = array[j + 1];
                }
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s = array[0] + "";
        for (int i = 1; i < index; i++) {
            s += ", " + array[i];
        }
        return "[" + s + "]";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
////       Object[] array2= (MyList) obj;
//        if (this.index != array2.length){
//            return false;
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array2[i]) {
//                return true;
//            }
//        }
//        return false;
//    }
}



