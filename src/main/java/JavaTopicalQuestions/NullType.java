package JavaTopicalQuestions;

/*Here there is a hierarchical relationship between Object and String, so when passed null
* a more specific version of them is called which is String
* But if also have a overloaded method with StringBuffer then it will give a compile time error because
* String and StringBuffer have no relations and compiler cant decide any specific between them*/
class A
{
    public void methodA(String s)
    {
        System.out.println("In String");
    }
    public void methodA(Object A)
    {
        System.out.println("In Object");
    }

}
public class NullType {
    public static void main(String[] args) {
        A a=new A();
        a.methodA(null);
    }
}
