import java.util.Scanner;
public class TwoNumArithmatic {

    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter num 1= ");
        int i= scan.nextInt();

        System.out.println("Enter num 2= ");
        int j=scan.nextInt();

        System.out.println("sum of "+i+" and "+j+" is "+ (i+j));
        System.out.println("Difference of "+i+" and "+j+" is "+ (i-j));
        System.out.println("Product of "+i+" and "+j+" is "+ (i*j));
        System.out.println("Division of "+i+" and "+j+" is "+ (i/j));
        System.out.println("Maximum from "+i+" and "+j+" is "+ Math.max(i,j));
        System.out.println("Minimum of "+i+" and "+j+" is "+ Math.min(i,j));


    }


}
