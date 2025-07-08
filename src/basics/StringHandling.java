package basics;

public class StringHandling {
    public static void main(String[] args) {

        String name = "Jon doe";

        // This method is more professional, but it depends on the context in which is used.
        System.out.println(String.format("Hi, good afternoon %s", name));

        // This method does not even work to save text in variables.
        System.out.printf("Hi, goodnight %s", name);

        int age = 18;
        // This method is good when you have many concatenations.
        String message = "You have %d years old and your name is %s".formatted(age, name);
        System.out.println(message);

    }
}
