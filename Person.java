public class Person {
    private String name;
    private int age;
    private static int count;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public Person() {

    }

    public void printPerson() {
        System.out.println(name + " " + age + " " + count);
    }
}
