import java.util.Scanner;
public class CelsiusFahenheitKelvin {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Celsius degree:");
        float i=scn.nextFloat();

        float F=(((float)1.8*i)+(float)32);
        System.out.println("Celsius to Farenheit= "+ F +" Fahrenheit");

        float K= i + 273;

        System.out.println("Celsius to Kelvin= "+ K +" Kelvin");

    }
}
