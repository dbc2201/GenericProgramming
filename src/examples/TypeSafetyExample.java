package examples;

public class TypeSafetyExample {
    public static void main(String[] args) {
        NonGenericClass n1;
        n1 = new NonGenericClass(88);
        n1.showType();
        int number = (int) n1.getObject();
        System.out.println("Number: " + number);
        NonGenericClass n2;
        n2 = new NonGenericClass("Hello, World!");
        n2.showType();
        String value = (String) n2.getObject();
        // This approach is not "Type-Safe"!
        // The compiler is showing us conflicting types of the same value!
        n1 = n2;
        number = (int) n1.getObject();
        Gen<Integer> g1 = new Gen<Integer>(45);
        Gen<String> g2 = new Gen<String>("Hello");
//        g1 = g2;
        // This approach is "Type-Safe"!
    }
}

class Gen<T> {
    private T field;

    public Gen(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}

class NonGenericClass {
    private Object object;

    public NonGenericClass(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void showType() {
        System.out.println("The type of the field is: " + object.getClass().getSimpleName());
    }
}
