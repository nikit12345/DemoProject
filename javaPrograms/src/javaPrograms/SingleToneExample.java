package javaPrograms;

public class SingleToneExample {
    private static SingleToneExample instance;

    // Private constructor to prevent instantiation from outside
    private SingleToneExample() {}

    // Method to get the single instance of SingleToneExample
    public static SingleToneExample getInstance() {
        if (instance == null) {
            instance = new SingleToneExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is a single tone example!");
    }

    
    public static void main(String[] args) {
        // Getting the instance of SingleToneExample
        SingleToneExample singleTone = SingleToneExample.getInstance();

        // Using the method to show a message
        singleTone.showMessage();
    }
}
