@FunctionalInterface
interface Constraints
{
    void sayHello();
}
class A implements Constraints
{
    @Override
    public void sayHello() {
        System.out.println("IN A Hello");
    }
}
class B implements Constraints
{
    @Override
    public void sayHello() {

    }
}
public class Example {
    public static void main(String[] args) {

        Constraints constraints=new A();
        print(constraints);
    }

    public static void print(Constraints constraints)
    {
        constraints.sayHello();
    }
}
