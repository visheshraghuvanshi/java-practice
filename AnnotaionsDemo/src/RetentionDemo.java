import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeRetentionAnnotation {}

@RuntimeRetentionAnnotation
public class RetentionDemo {
    public static void main(String[] args) {
        boolean isPresent = RetentionDemo.class.isAnnotationPresent(RuntimeRetentionAnnotation.class);
        System.out.println("Is RuntimeRetentionAnnotation Present? : " + isPresent);
    }
}
