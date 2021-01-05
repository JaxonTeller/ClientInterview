import java.io.IOException;
import java.nio.file.FileSystemException;

class Someone
{
    private int doYouHaveAccess=0;
    public static void methodA(String name)
    {
        System.out.println("Name"+name);
    }

    public static void methodA()
    {
        System.out.println("Nothing");
    }



    public final String methodFinalA(String name)
    {
        System.out.println("final method ");
        return null;
    }

    public final String methodFinalA(Integer age)
    {
        System.out.println("Another final method");
       return null;
    }

    public void canBeOverided() throws IOException
    {
        System.out.println("Can be overrided");
        throw new IOException("Something went wromg");
    }

    public Object anotherCanBe()
    {
        return "Hello";
    }
}
class B extends Someone
{
    public static void methodA(String name)
    {
        System.out.println("Name"+name);
    }

    /*Can throw Sub Exception of what Base class method is throwing*/
    @Override
    public void canBeOverided() throws FileSystemException {
        System.out.println("Can be overided from derived class");
    }

    /*Return type has to be a subtype*/
    @Override
    public String anotherCanBe() {
        return (String) super.anotherCanBe();
    }
}
public class Example {
    public static void main(String[] args) throws Exception {
       Someone someone=new Someone();
       //Static and final method can be overloaded
       /*someone.methodFinalA("Name");
       someone.methodFinalA(24);
       Someone.methodA();
       Someone.methodA("name");*/

        //method hiding with static method and final method can not be overrided
       Someone someone1=new B();
       someone1.methodA();

       someone1.canBeOverided();
    }
}
