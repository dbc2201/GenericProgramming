# Generics in Java Programming (Generic Programming)

- Generics basically means _parameterized types_.
- _Parameterized types_ are important because we can create
    - classes
    - interfaces, and
    - methods  
in which the type of the data which we want to operate on is 
specified as a parameter.
- Using `Generics` it is possible to create a single class, that can 
work with a lot of different types of data.
A class, that operates on _parameterized types_ is called a `Generic Class`.

## Points about Generic Programming

1. Generics only work with a reference type.
When we want to declare an object of a "generic" class,
the `type argument` that is passed to the `type parameter` should always be a
_reference type_.
We cannot use a primitive type such as `char`, `int`, `float`, or `boolean`.
If we want to pass a primitive type value, we can use the wrapper classes available
for the primitive type, such as
byte -> `java.lang.Byte`
short -> `java.lang.Short`
int -> `java.lang.Integer`
long -> `java.lang.Long`
float -> `java.lang.Float`
double -> `java.lang.Double`
char -> `java.lang.Character`
boolean -> `java.lang.Boolean`

