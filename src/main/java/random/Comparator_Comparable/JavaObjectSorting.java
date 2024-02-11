package random.Comparator_Comparable;

import java.util.Arrays;

public class JavaObjectSorting {

    public static void main(String[] args)
    {
        //sorting custom Object Array
Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10,"Mikey", 25,10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        //sorting employees array using Comparable interface implementation
      //  Arrays.sort(empArr);
       // System.out.println("Default sorting using comparable interface "+Arrays.toString(empArr));

        // Sort employee array using comparator by Salary
        Arrays.sort(empArr,Employee.salaryComparator);

        System.out.println("Sorting Employee data based on Salary :\n"+Arrays.toString(empArr));

    }
}
