package examples.rules;

public class Rule2 {
    public static void main(String[] args) {
        GenericClass2<Float> v1 = new GenericClass2<Float>(3.14f);
        GenericClass2<Short> v2 = new GenericClass2<Short>((short) 15);
        // v1 != (not compatible) v2
    }
}

class GenericClass2<T> {
    private final T field;

    public GenericClass2(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}

