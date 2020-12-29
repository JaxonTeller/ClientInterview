package Java8Features;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface CriteriaBasedInterface<T>
{
     boolean test(T t);
}

class Employee
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee()
    {

    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", CopyConstructors.Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}
public class Java8Practice {
    public static void main(String[] args) throws Exception {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


      /*Java8Features.Print employee names with age > 20*/
        List<String> empNamesWithAgeGT20 =
                employeeList.stream().filter(employee -> employee.getAge() > 29).map(Employee::getName).collect(Collectors.toList());
        empNamesWithAgeGT20.forEach(System.out::println);

      /*Count #of employees with age > 25*/
        long count = employeeList.stream().filter(employee -> employee.getAge() > 25).count();
        System.out.println("Java8Features.Employee with age > than 25 "+count);

     /*Find the employee with name Nitin Joshi*/
        Optional<Employee> nitin_joshi =
                employeeList.stream().filter(employee -> employee.getName().equals("Niti Joshi")).findFirst();
        nitin_joshi.ifPresentOrElse(System.out::println,()->{
            System.out.println("Java8Features.Employee with given name is not present");
        });
        Employee employee = nitin_joshi.orElseGet(Employee::new);
        System.out.println(employee);

        /*Find max age of employee*/
        Optional<Employee> maxAgeEmployee = employeeList.stream().max(Comparator.comparing(Employee::getAge));
        Employee employee1 = maxAgeEmployee.orElseThrow(Exception::new);
        System.out.println("Max age of employee is "+ employee1.getAge());

        OptionalInt maxage = employeeList.stream().flatMapToInt(employee2 -> IntStream.of(employee2.getAge())).max();
        System.out.println(maxage.getAsInt());

        /*Sort all the emp on basis of age*/
        List<Employee> sortedByAge = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        sortedByAge.forEach(System.out::println);

        /*Join all the employee names with ,*/
        String collect = employeeList.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(collect);

        /*Group all employee by there name*/
        Map<String, List<Employee>> groupByName = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(groupByName);

        /*List of age, remove duplicates*/
        employeeList.stream().flatMapToInt(employee2 -> IntStream.of(employee2.getAge())).distinct().forEach(System.out::println);

        /*list of numbers, square them, find out ones > 28 and find there average*/
        IntUnaryOperator intUnaryOperator=(int age)-> age * age;
        OptionalDouble average = employeeList.stream().mapToInt(Employee::getAge).filter(i -> i > 28).map(intUnaryOperator).average();
        System.out.println(average);

        /*To Java8Features.Print 5 random # in Java*/
        Random random=new Random();
//        IntStream.range(0,5).forEach(i -> System.out.println(random.nextInt()));
//        random.ints().limit(5).forEach(System.out::println);

        /*To print 5 random # in sorted manner*/
        random.ints().limit(5).sorted().forEach(System.out::println);

        /*Sum of all the # in list*/
        IntSummaryStatistics intSummaryStatistics = employeeList.stream().mapToInt(Employee::getAge).summaryStatistics();
        System.out.println(intSummaryStatistics);

        /*StringJoiner is NOT THREAD SAFE*/
        StringJoiner stringJoiner=new StringJoiner(":","[","]");
        for (String s:
             empNamesWithAgeGT20) {
            stringJoiner.add(s);
        }
        System.out.println(stringJoiner);

        /*Sort an array and convert it into Stream*/
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.sort(arr);
        Stream.of(arr);

        /*#of String in list whose lenght > 12*/
        long count1 = empNamesWithAgeGT20.stream().filter(name -> name.length() > 12).count();
        System.out.println(count1);

        /*Concat 2 Streams*/
        Stream<Object> concat = Stream.concat(Stream.of(List.of("Nishu", "Golu")), Stream.of(1, "Jayade"));
        concat.forEach(System.out::println);

        /*Remove duplicates using sets and stream*/
        Set<Integer> withoutDuplicates = employeeList.stream().map(Employee::getAge).collect(Collectors.toSet());

        /*How many male and female are there */
        Map<String, Long> maleAndFemaleCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleAndFemaleCount);

        /*What is avg age of male and female employees*/
        Map<String, Double> maleFemaleAvgAge =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(maleFemaleAvgAge);

        /*Highest paid amount*/
        double asDouble = employeeList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        System.out.println(asDouble);

        /*Highest paid employee details*/
        Optional<Employee> first = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
        System.out.println(first.get());

        /*# of employees in each department*/
        Map<String, Long> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect1);

        /*Seprate the employee who are younger than 25 and older than 25*/
        Map<Boolean, List<Employee>> collect2 = employeeList.stream().collect(Collectors.partitioningBy(employee2 -> employee2.getAge() < 25));


        /*Who has the most working expierence in Organazation*/
        Optional<Employee> first1 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(first1);


    }
}



