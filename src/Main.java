import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(4);
        v.add(7);
        v.add(6);
        v.add(20);
        v.add(4);
        v.add(20);
        v.add(4);
        v.add(20);
        v.add(4);
        v.add(2);
        v.add(65);
        v.add(7);
        v.add(14);
        v.add(22);
        v.add(4);
        v.add(30);
        v.add(4);
        v.add(20);
        v.add(4);
        v.add(20);
        v.add(4);
        v.add(20);
        v.add(4);
        v.add(20);



        Collections.sort(v);

        for (int i : v)
            System.out.println(i);

        System.out.println();

        System.out.println(v.capacity());
    }
}