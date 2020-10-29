package examples.rules;

public class Rule1 {
    public static void main(String[] args) {

    }
}

class GenericClass1<T> {
    private final T field;

    public GenericClass1(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
