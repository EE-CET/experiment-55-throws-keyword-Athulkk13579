import java.io.IOException;
import java.util.Scanner;

public class ThrowsKeywordDemo {

    public static void check(int n) throws IOException {
        if (n < 0) {
            throw new IOException();
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            try {
                check(n);
            } catch (IOException e) {
                System.out.println("Caught: IO Exception");
            }
        }

        scanner.close();
    }
}
