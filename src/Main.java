import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(77);
        values.add(88);

        values.add(1,9);

        for (int i : values)
            System.out.println(i);
    }
}