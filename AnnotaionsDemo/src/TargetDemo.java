import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//It Restricts where an annotation type can be applied
@Target(ElementType.TYPE)
@interface ClassOnlyAnnotation {
    String info() default "Class Annotation Only";
}

@ClassOnlyAnnotation(info = "Demo Class Annotation")
public class TargetDemo {
    public static void main(String[] args) {
        System.out.println("Annotation Applied only to class");
    }
}
