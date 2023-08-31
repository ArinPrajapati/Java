public class SuperObjecTinJava {
    public static void main(String[] args) {
        Hero hero1 = new Hero("batman", 34, "Money");
        Hero hero2 = new Hero("ironMan", 45, "iron");

        System.out.println(hero1.toString());
    }
}

class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }

}

class Hero extends person {
    String Power;

    Hero(String name, int age, String Power) {
        super(name, age);

        this.Power = Power;

    }
    public String toString() {
        return super.toString() + "\n" + this.Power;
    }


}
