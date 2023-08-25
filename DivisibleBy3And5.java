public class DivisibleBy3And5 {
    public static void main(String[] args) {
        DivisibleBy3And5 div=new DivisibleBy3And5();
        div.divBy();

    }
    void divBy()
    {
        System.out.println("the numbers which are divisible by 3 are: ");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();

        System.out.println("the numbers which are divisible by 5 are: ");
        for(int i=1;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        System.out.println("the numbers divisible by both 3 and 5: ");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
