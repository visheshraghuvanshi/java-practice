import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface WordsList {
    Words[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(WordsList.class)
@interface Words {
    String value();
}

public class RepeatableDemo {
    @Words("Hello")
    @Words("World")
    public static void repeatMethod() {}

    public static void main(String[] args) throws NoSuchMethodException {
        Words[] words = RepeatableDemo.class.getMethod("repeatMethod").getAnnotationsByType(Words.class);
        for (Words word: words) {
            System.out.println(word.value());
        }
    }
}
