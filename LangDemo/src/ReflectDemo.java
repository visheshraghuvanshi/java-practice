import java.lang.reflect.*;

class My {
    public int a;
    protected int b;
    public int c;
    int d;

    public My() {}
    public My(int x, int y) {}

    public void display(String s1, String s2) {}
    public int show(int x, int y) {
        return 0;
    }
}

public class ReflectDemo {
    public static void main(String[] args) {
        Class c = My.class;
        System.out.println(c.getName());
        Field[] field = c.getDeclaredFields();
        for(Field f:field)
            System.out.println(f);

        Constructor[] con = c.getConstructors();
        for(Constructor ct:con)
            System.out.println(ct);

        Method[] meth = c.getMethods();
        for(Method m:meth)
            System.out.println(m);

        Parameter[] param = meth[0].getParameters();
        for(Parameter p:param)
            System.out.println(p);

//        My m = new My();
//        Class c1 = m.getClass();

    }
}
