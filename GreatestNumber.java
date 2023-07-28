import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter first number");
        int i= scn.nextInt();

        System.out.println("Enter second number");
        int j=scn.nextInt();

        System.out.println("Enter third number");
        int k=scn.nextInt();

        if (i>j && i>k)
        {
            System.out.println(i+" is greatest number");
        } else if (j>i && j>k)
        {
            System.out.println(j+" is greatest number");
        } else if (k>i && k>j)
        {
            System.out.println(k+" is greatest number");
        }

    }
}
