import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClassNameRegex classNameRegex = new ClassNameRegex();
        System.out.println("=== Input class name you want ===");
        Scanner input = new Scanner(System.in);
        String classNameInput = input.nextLine();
        boolean isValid = classNameRegex.validate(classNameInput);
        System.out.println("Class name inputed is: " + classNameInput + " - is valid: " + isValid);
    }
}
