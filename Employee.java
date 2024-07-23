public class Employee {
    private String name;
    private String jobTitle;
    private int salary;
    private static double tax = 0.1;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public double annualSalary() {
        return salary * 12;
    }

    public double netIncome() {
        return annualSalary() - annualSalary() * tax;
    }

    public static void compareSalary(Employee emp1, Employee emp2) {
        if (emp1.netIncome() >emp2.netIncome()){
            System.out.println(emp1.name+ " has more income.");
        }
        else if (emp1.netIncome() <emp2.netIncome()){
            System.out.println(emp2.name+ " has more income.");
        }
        else {
            System.out.println("incomes are equal.");
        }
    }
}
