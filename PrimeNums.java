import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a no.");
        int num=scn.nextInt();
        PrimeNums p1=new PrimeNums();
        p1.primeNumCheck(num);

    }
    public void primeNumCheck(int num)
    {
        int count=0;
        for (int i=2;i<num;i++) {

            if (num%i==0){
                count++;
            }
        }
        if(!(count>0)){
            System.out.println(num+" is prime ");
        }else{
            System.out.println(num+" is not prime ");
        }
    }
}
