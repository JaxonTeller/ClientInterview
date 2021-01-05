import java.util.Collections;
import java.util.List;

class A
{

    A()
    {
        System.out.println("IN A");
    }
    public void someMethod() throws Exception
    {

    }
}
class BBB extends A
{

    BBB()
    {
        System.out.println("IN B");
    }
    @Override
    public void someMethod()  {
        System.out.println("Some");
    }
}

public class Exam {
    public static void main(String[] args) throws Exception {
       A a=new BBB();
        a.someMethod();

        String some=new String("Something");
        String someOtherThing="Something";
        String another="Something";
        System.out.println(someOtherThing==another);

    }
}
