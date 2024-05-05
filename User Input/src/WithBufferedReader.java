import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        // char Input
        System.out.print("Enter a char: ");
        char c = (char) scanner.read();
        System.out.println("You've entered the character: " + c);

//        scanner.read();

        // String Input
        System.out.print("Enter a string: ");
        String str = scanner.readLine();
//        String str = "\n";
        System.out.println("You entered: " + str + "<-");

        // int Input
        System.out.print("Enter a int: ");
        int n = Integer.parseInt(scanner.readLine());
        System.out.println("You entered: " + n);

        // float Input
        System.out.print("Enter a float: ");
        float f = Float.parseFloat(scanner.readLine());
        System.out.println("You entered: " + f);

        // double Input
        System.out.print("Enter a double: ");
        double d = Double.parseDouble(scanner.readLine());
        System.out.println("You entered: " + d);

        // boolean Input
        System.out.print("Enter a boolean: ");
        boolean b = Boolean.parseBoolean(scanner.readLine());
        System.out.println("You entered: " + b);

    }
}