import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int i=scan.nextInt();

        String res=(i>0)?"Positive":"Negative";

        System.out.println(res);
    }
}
