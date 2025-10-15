import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)  //Needed
@interface InheritedAnnotation {
    String value() default "Inherited";
}

@InheritedAnnotation(value = "Parent Annotation")
class Parent1 {}

class Child1 extends Parent1 {}

public class InheritedDemo {
    public static void main(String[] args) {
        InheritedAnnotation annotation = Child1.class.getAnnotation(InheritedAnnotation.class);
        System.out.println("Inherited annotation value: " + annotation.value());
    }
}
