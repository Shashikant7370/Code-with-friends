
import java.time.LocalDate;
import java.util.*;
class Employee{
    String name,hire_date;
    Integer salary;

    Employee(String name,int salary,String h_date){
        this.name = name;
        this.salary = salary;
        this.hire_date = h_date;
    }

    public static int checkYear(int hireYear){
        LocalDate currentDate = LocalDate.now();
        int cur_year = currentDate.getYear();
        int yearOfService = cur_year-hireYear;
        return yearOfService;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hired year(format:yyyy) : ");
        int h = sc.nextInt();
        Employee emp = new Employee("Shashikant kuamr",50000,String.valueOf(h));
        
        int result = checkYear(h);
        System.out.println(emp.name+", You hired in "+emp.hire_date+". you are working from "+result+" years and your salary is "+
        emp.salary);
    }
}