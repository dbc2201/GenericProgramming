package examples.rules;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Rule1 {
    public static void main(String[] args) {
        GenericClass1<Byte> byteObject = new GenericClass1<Byte>((byte) 1);
        GenericClass1<Short> shortObject = new GenericClass1<Short>((short) 10);
        GenericClass1<Integer> integerObject = new GenericClass1<Integer>(45);
        GenericClass1<Long> longObject = new GenericClass1<Long>(451L);
        GenericClass1<Float> floatObject = new GenericClass1<Float>(3.14f);
        GenericClass1<Double> doubleObject = new GenericClass1<Double>(4.2);
        GenericClass1<Character> characterObject = new GenericClass1<Character>('A');
        GenericClass1<Boolean> booleanObject = new GenericClass1<Boolean>(true);
        GenericClass1<String> stringObject = new GenericClass1<String>("Hello");
        GenericClass1<BigInteger> bigIntegerObject = new GenericClass1<BigInteger>(BigInteger.ONE);
        GenericClass1<BigDecimal> bigDecimalObject = new GenericClass1<BigDecimal>(BigDecimal.ONE);
        GenericClass1<Student> studentObject = new GenericClass1<Student>(new Student());
//        GenericClass1<int> intObj = new GenericClass1<int>(45);
    }
}

class Student {
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
