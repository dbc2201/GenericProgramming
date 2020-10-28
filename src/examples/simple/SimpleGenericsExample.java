package examples.simple;

// A normal definition class.
// A `non-generic` definition class.
// We can add any alphabet from A-Z, but some alphabets are used as a standard
// T -> Type
// K -> Key
// V -> Value
// R,S,U,V -> Data
public class SimpleGenericsExample<T> {
    // Now, this class is an example of a Generic class.

    // T is called the Type Parameter ( for Data Type )

    private final T field; // what is the data type of the field currently? N/A
    // T is just a placeholder to tell the compiler that
    // the data type of this field will be declared when an instance of this class
    // is created!

    public SimpleGenericsExample(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}

class Main {
    public static void main(String[] args) {
        // for the Type parameter, we can only use
        // reference types
        // Wrapper classes (Short, Integer, Byte, Double etc)
        // String, BigInteger, BigDecimal
        // etc
        SimpleGenericsExample<Integer> object1 = new SimpleGenericsExample<>(4);
        SimpleGenericsExample<Double> object2 = new SimpleGenericsExample<>(25.3);
    }
}
