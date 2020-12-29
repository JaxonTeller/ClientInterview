package CopyConstructors;

class Student
{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(Student student)
    {
        this.age=student.getAge();
        this.name=student.getName();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class CopyConstructorEx {
    public static void main(String[] args) {
        Student student=new Student(25,"Nishikant");
        System.out.println(student.getAge()+" "+student.getName());

        Student student1=new Student(student);
        System.out.println(student.getAge()+" "+student.getName());

    }
}
