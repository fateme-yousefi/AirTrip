public class Main {

    public static void main(String[] args) {
        Person nima = new Person("nima", 27);
        nima.printPerson();
        Person first = new Person("f", 27);
        Person second = new Person("s", 30);
        first.printPerson();
        second.printPerson();

        Rectangle rectangle1 = new Rectangle(2, 4);
        rectangle1.perimeter();
        rectangle1.area();

        Employee worker1 = new Employee("A", "B", 1000);
        System.out.println(worker1.annualSalary());
        System.out.println(worker1.netIncome());
        Employee ali = new Employee("A", "B", 1000);
        Employee reza = new Employee("A", "B", 1000);

        Employee.compareSalary(ali, reza);

//        AirTrip firstFlight = new AirTrip("1","1", 20:47, 20:49);

    }



}
