
import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo 
{
    static void check(int n) throws IOException 
    {
        if (n < 0) 
        {
            throw new IOException();
        } 
        else 
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try 
        {
            check(n);
        }
        catch (IOException e) 
        {
            System.out.println("Caught: IO Exception");
        }
        sc.close();
    }
}
