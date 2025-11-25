import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String PREDEFINED = "Carmen";

        System.out.print("Enter your name > ");
        String name = input.nextLine();

        if (name.equals(PREDEFINED)) {
            System.out.println("Carmen equals " + name);
        } else {
            System.out.println("Carmen does not equal " + name);
        }
    }
}
