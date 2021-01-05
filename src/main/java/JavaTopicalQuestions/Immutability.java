package JavaTopicalQuestions;

class Mentor implements Cloneable
{
    String name;

    public Mentor(String name)
    {
        this.name=name;
    }

  /*  copy constructor
    public Mentor(Mentor mentor)
    {
        this.name=mentor.name;
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
final class Student
{
    private final String name;
    private final int rollNo;
    private final Mentor mentor;

    public Student(String name, int rollNo,Mentor mentor) throws CloneNotSupportedException {
        this.name = name;
        this.rollNo = rollNo;
        //this.mentor=mentor;

     /*   Using copy constructor
        this.mentor=new Mentor(mentor);*/
        this.mentor= (Mentor) mentor.clone();
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Mentor getMentor() throws CloneNotSupportedException {
        /*return new Mentor(this.mentor.name);*/
        return (Mentor) this.mentor.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", mentor=" + mentor +
                '}';
    }
}
public class Immutability {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Immutable class student with mutable reference to mutable object Mentor
        Mentor mentor=new Mentor("Tarun");
        Student student=new Student("Nishikant",25,mentor);

        System.out.println(student);

       /* breaking the immutability with the mutable reference
        student.getMentor().name="Varun";
        System.out.println(student);*/

/*
        so to avoid this,we can use copy constructor for mutable reference and on getter
        the same can be done with cloning
*/
        student.getMentor().name="Varun";
        System.out.println(student);
    }
}
