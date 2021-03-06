package part2.ex2;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge(){
        return this.age*7;
    }

    @Override
    public String toString() {
        return "Кличка:" + name +
                "\nВозраст:" + age +
                "\nЧеловеческий возраст:" + getHumanAge();
    }
}
