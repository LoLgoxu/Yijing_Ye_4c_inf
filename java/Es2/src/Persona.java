import java.util.Scanner;

public class Persona {
    Scanner input = new Scanner(System.in);
    String name;
    int age;

    void setName() {
        name = input.nextLine();
    }

    void setAge() {
        age = input.nextInt();
    }

    void getName() {
        System.out.println(name);
    }

    void getAge() {
        System.out.println(age);
    }
}
