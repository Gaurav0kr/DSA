package random.Comparator_Comparable;

import java.util.Comparator;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public long getSalary(){
        return salary;
    }
    public Employee(int id,String name,int age,long salary) {
        this.id = id;
        this.name= name;
        this.age = age;
        this.salary = salary;
    }
    //Comparator to sort Employee data based on SALARY
    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int)(e1.getSalary()-e2.getSalary());
        }
    };
    //Comparator to sort Employee data based on age
    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge()-e2.getAge();
        }
    };
    //Comparator to sort based on Name
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    //sort employee based on ID, if ID is same then sort based on Name
    public static Comparator<Employee> idNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {

            int flag = e1.getId()-e2.getId();
            if(flag==0)
                flag = e1.getName().compareTo(e2.getName());
            return flag;
        }
    };
}
