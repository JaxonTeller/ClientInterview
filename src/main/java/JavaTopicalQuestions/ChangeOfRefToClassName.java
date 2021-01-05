package JavaTopicalQuestions;

import java.io.FileNotFoundException;

class Shape
{
    String name="Nishu";
    public static void sayHello()
    {
        System.out.println("Hello");
    }
}
class Circle extends Shape
{
    String name="Golu";
    public static void sayHello()
    {
        System.out.println("Hello In Circle");
    }
}
public class ChangeOfRefToClassName {
    public static void main(String[] args) {
        Shape s=null;
        /*Here NUllPOINTEREX is not throws as sayHello is static method, compiler will replace s with Shape and will call
        * Shape.sayHello() which gives the output*/
        s.sayHello();

        Shape s1=new Circle();
        s1.sayHello();


        /*Member variables are NOT overridden*/
        System.out.println(s1.name);
    }
}
