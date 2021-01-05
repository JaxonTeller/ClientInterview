package JavaTopicalQuestions;

class B
{
    public void methodB()
    {
        System.out.println("In Class B");
    }
}
class C extends B
{
    /*public void methodB(String c) {
        System.out.println("In Class C");
    }*/

   /* This shows we can remove the throws clause entirely while overriding.
    @Override
    public void methodB() {
        System.out.println("In C");
    }*/
}
public class MethodOverriding {
    public static void main(String[] args) throws Exception {
        B b=new C();
        b.methodB();// calls super class method only as the methodB is not overrided in C, just overloaded
    }
}
