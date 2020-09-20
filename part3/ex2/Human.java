package part3.ex2;

public class Human {
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

    private String name;
    private int age;

    static class Leg {
        public static void step(int amount) {
            if (amount == 1) System.out.println("I made a step!");
            else System.out.printf("I made %d steps!\n",amount);
        }
    }
    static class Hand {
        public static void grab(String something){
            System.out.printf("I grabbed %s!\n",something);
        }
    }
    static class Head {
        public static void scream(){
            System.out.println("AAAAAAAAAAAA");
        }
    }
}

