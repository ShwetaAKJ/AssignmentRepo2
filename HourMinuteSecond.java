import java.util.Scanner;
public class HourMinuteSecond {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);

       System.out.println("Enter seconds: ");
        long sec= scn.nextLong();

        long min=sec/60;
        long seconds=sec%60;
        //now converting min into hour
        long hour=min/60;
        //above take reminder which is . minutes
        long fmin=min%60;

        System.out.println(hour+" hours "+fmin+" minutes "+seconds+" seconds ");


    }
}
