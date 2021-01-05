package JavaTopicalQuestions;

import java.util.HashMap;
import java.util.Map;

class Person
{
    private String name;
    private int identificationNo;

    public Person(String name, int rollNo) {
        this.name = name;
        this.identificationNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getIdentificationNo() {
        return identificationNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentificationNo(int identificationNo) {
        this.identificationNo = identificationNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return identificationNo == person.identificationNo;
    }

    @Override
    public int hashCode() {
        return identificationNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rollNo=" + identificationNo +
                '}';
    }
}
final class PersonImmutable
{
    private final String name;
    private final int identificationNo;

    public PersonImmutable(String name, int rollNo) {
        this.name = name;
        this.identificationNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getIdentificationNo() {
        return identificationNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonImmutable person = (PersonImmutable) o;

        return identificationNo == person.identificationNo;
    }

    @Override
    public int hashCode() {
        return identificationNo;
    }

    @Override
    public String toString() {
        return "PersonImmutable{" +
                "name='" + name + '\'' +
                ", rollNo=" + identificationNo +
                '}';
    }
}
public class MutableAndImmutableKeyInHashmap {
    public static void main(String[] args) {
        Person person=new Person("Nishikant",101);
        Map<Person,Integer> personSalaryMap=new HashMap<>();
        personSalaryMap.put(person,46000);

        //mutable so change
        person.setIdentificationNo(102);

        //op: null as we have changed the value
        System.out.println(personSalaryMap.get(person));

        //hence it is better if it is immutable
        PersonImmutable personImmutable=new PersonImmutable("Nishikant",101);
        Map<PersonImmutable,Integer> personSalaryMap1=new HashMap<>();
        personSalaryMap1.put(personImmutable,46000);

        //we cant change it as immutable
        System.out.println(personSalaryMap1.get(personImmutable));
    }
}
