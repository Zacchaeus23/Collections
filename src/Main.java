import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(77);
        values.add(88);

//        Iterator i = values.iterator();
//        while (i.hasNext())
//            System.out.println(i.next());

        for (int i : values)
            System.out.println(i);
    }
}