public class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof!");
    }

    public boolean eat(String foodType) {
        return true;
    }

    public boolean showMood(boolean happy) {
        if (happy) {
            System.out.println("Logrer");
        } else {
            System.out.println("Knurrer");

        }
        return happy;
    }

}
