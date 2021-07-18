package netcracker.task1;

/**
 * Main class to test voices
 */
public class MainClass {
    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        Voice cat = new Cat();
        cat.voice();
        Voice dog = new Dog();
        dog.voice();
        Voice cow = new Cow();
        cow.voice();
    }
}
