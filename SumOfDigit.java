public class SumOfDigit {
    public static void main(String[] args) {

        SumOfDigit obj=new SumOfDigit();
        int result=obj.sumOfDigit(2345);
        System.out.println(result);
    }
    public int sumOfDigit(int num)
    {
        int sum=0;
        do {
            sum=sum+num%10;
            num=num/10;
        }while(num!=0);
        return sum;
    }
}
