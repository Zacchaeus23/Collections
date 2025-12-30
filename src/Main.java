import java.util.ArrayList;

class Container<T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends T> obj){

    }
}
public class Main {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>();

        obj.value = 9;

        obj.show();
        obj.demo(new ArrayList<>());
    }
}