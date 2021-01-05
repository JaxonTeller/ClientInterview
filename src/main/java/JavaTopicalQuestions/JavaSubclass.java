package JavaTopicalQuestions;

import Threads.DeadlockExample;
/*B can not extends A because A doesnt have any public default constructor
class A
{
    int a;
    private A(){}

    private A(int a)
    {

    }
}
class B extends A
{
}*/

/*Top level class can not be private or protected
protected class C
{

}*/

/*Inner class can be private/ protected
class C
{
    protected class D
    {

    }
}*/

/*If inner class is private then it is same as private member you can not access it outside
If inner class is protected then it can be accessed outside only if it is static
class C
{
    private class E
    {

    }

    protected static class D
    {

    }
}*/

/*
private methods are not inheritated hence can not be overridden
class C
{
    private void method()
    {
        System.out.println("Private method");
    }
}
class D extends C
{
    @Override
    private void method()
    {
        System.out.println("Private method in D");
    }
}*/
public class JavaSubclass {
    public static void main(String[] args) {

    }
}
