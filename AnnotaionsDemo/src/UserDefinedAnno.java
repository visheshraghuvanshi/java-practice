
@interface MyAnno { //Empty can be used anywhere
    String name(); // no parameter, cannot throw exception
    String project();
    String date() default "1/1/2000";
    int version() default 1;
}

@MyAnno(name="Ajay", project="Bank", date="15/10/2025")
public class UserDefinedAnno {
    public static void main(String[] args) {

    }
}
