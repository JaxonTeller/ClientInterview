//import java.util.Date;
//class DepartmentForEmp implements Cloneable
//{
//    private String name;
//
//    DepartmentForEmp(String name)
//    {
//        this.name=name;
//    }
//
//    DepartmentForEmp(DepartmentForEmp departmentForEmp)
//    {
//        this.name= departmentForEmp.getName();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "DepartmentForEmp{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//final class Java8Features.Employee
//{
//    private final String name;
//    private final int age;
//    private final Date date;
//    private final DepartmentForEmp departmentForEmp;
//
//    public Java8Features.Employee(String name, int age, Date date,DepartmentForEmp departmentForEmp) throws CloneNotSupportedException {
//        this.name = name;
//        this.age = age;
//        //Deep copy of mutable references
//        this.date = new Date(date.getTime());
//        //this.departmentForEmp=new DepartmentForEmp(departmentForEmp);
//        this.departmentForEmp= (DepartmentForEmp) departmentForEmp.clone();
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
////    public DepartmentForEmp getDepartmentForEmp() {
////        return new DepartmentForEmp(departmentForEmp);
////    }
//
//    public DepartmentForEmp getDepartmentForEmp() throws CloneNotSupportedException {
//        return (DepartmentForEmp) departmentForEmp.clone();
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Date getDate() {
//        return new Date(this.date.getTime());
//    }
//
//    @Override
//    public String toString() {
//        return "Java8Features.Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", date=" + date +
//                ", departmentForEmp=" + departmentForEmp +
//                '}';
//    }
//}
//public class EmployeeForImmutable {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Date date=new Date();
//        DepartmentForEmp departmentForEmp=new DepartmentForEmp("Global Delivery");
//        Java8Features.Employee employee=new Java8Features.Employee("Nishu",25,date,departmentForEmp);
//        System.out.println(employee);
//
//        departmentForEmp.setName("Changed Global Delivery");
//        System.out.println(employee);
//
//    }
//}
