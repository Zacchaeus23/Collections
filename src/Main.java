import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(3);
        values.add("Zack");
        values.add(5.8f);

        Iterator i = values.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
    }
}