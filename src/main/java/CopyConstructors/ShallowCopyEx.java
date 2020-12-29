package CopyConstructors;

class Department
{
    String name;
    Department(String name)
    {
        this.name=name;
    }
}
class ExcellentEmployee implements Cloneable
{
    String empName;
    Department department;

    public ExcellentEmployee(String empName, Department department) {
        this.empName = empName;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ShallowCopyEx {
    public static void main(String[] args) {
        Department department=new Department("IT");
        ExcellentEmployee excellentEmployee=new ExcellentEmployee("Nishikant",department);
        ExcellentEmployee excellentEmployee1=null;

        try {
            excellentEmployee1= (ExcellentEmployee) excellentEmployee.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        excellentEmployee.department.name="Changed IT";

        System.out.println(excellentEmployee1.getDepartment().name);
    }
}
