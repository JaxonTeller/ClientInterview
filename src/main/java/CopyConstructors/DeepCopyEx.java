package CopyConstructors;

class ExcellentDepartment implements Cloneable
{
    String name;

    ExcellentDepartment(String name)
    {
        this.name=name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class ExtraEmployee implements Cloneable
{
    String empName;
    ExcellentDepartment excellentDepartment;

    public ExtraEmployee(String empName, ExcellentDepartment excellentDepartment) {
        this.empName = empName;
        this.excellentDepartment = excellentDepartment;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ExtraEmployee employeeClone = (ExtraEmployee) super.clone();
        employeeClone.excellentDepartment=(ExcellentDepartment)this.excellentDepartment.clone();
        return employeeClone;
    }
}
public class DeepCopyEx {
    public static void main(String[] args) {
        ExcellentDepartment department=new ExcellentDepartment("IT");
        ExtraEmployee employee=new ExtraEmployee("Nishu",department);
        ExtraEmployee employee1=null;

        try {
             employee1 = (ExtraEmployee) employee.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        employee1.excellentDepartment.name="Changed IT";

        System.out.println(employee.excellentDepartment.name);

    }
}
