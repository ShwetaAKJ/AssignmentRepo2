public class StatNonStatMethod {
    public static void main(String[] args) {
        StatNonStatMethod s1=new StatNonStatMethod();
        System.out.println("Addition of two nums by nonstatic method "+s1.add(1,2));
        System.out.println("Addition of two nums by static method "+StatNonStatMethod.sum(3,4));
    }

    public int add(int i , int j){

        int k = i+j;

        return k;

    }
    public static int sum(int i , int j){

        int l = i+j;

        return l;

    }
}
