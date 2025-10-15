import java.lang.annotation.Documented;

@Documented
@interface CustomAnnotation {
    String value();
}

//Check JavaDoc for annotation visibility
@CustomAnnotation("Explained")
public class DocumentedDemo {
    public static void main(String[] args) {

    }
}
