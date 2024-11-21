public class Cat extends Animal{

    public void makeSound(){
        System.out.println("Miaaav!");
    }

    public boolean eat(String foodType) {
        return true;
    }

    public boolean showMood(String mood) {
        return true;
    }

    public boolean showMood(boolean happy) {
        if (happy) {
            System.out.println("Spinder");
        } else {
            System.out.println("Hvæser");

        }
        return happy;
    }

}
