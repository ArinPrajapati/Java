import com.sun.security.jgss.GSSUtil;

public class ConstructorInJava {
    public static void main(String[] args) {
        Human human = new Human("arin", 15, 54);
        Human human2 = new Human("monty", 15, 40);
        System.out.println(human2.name);
        System.out.println(human.name);
        human2.eat();
        human.drink();
    }
}

class Human {
    String name;
    double weight;
    int age;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        // this = human and weight is weight it like this human.name = name;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }


}

