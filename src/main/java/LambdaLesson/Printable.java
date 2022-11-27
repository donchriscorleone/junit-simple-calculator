package LambdaLesson;

@FunctionalInterface
public interface Printable {
    String print();
//    Functional interfaces are only meant to have EXACTLY ONE method. Creating another method in this interface will result to compilation error.
}
