import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        while(true) {
        System.out.println("Enter Month Number");
        int month_num = scn.nextInt();

            if(month_num>12)
                break;

            switch (month_num) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("This Month having 31 days");
                    break;

                case 2:
                    System.out.println("This Month having 28 days");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("This Month having 30 days");
                    break;
                //default:


            }
        }
    }
}
