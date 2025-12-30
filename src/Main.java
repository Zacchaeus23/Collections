import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(3);
        values.add("Zack");
        values.add(5.8f);
        values.add(77);

//        Iterator i = values.iterator();
//        while (i.hasNext())
//            System.out.println(i.next());

        for (Object i : values)
            System.out.println(i);
    }
}