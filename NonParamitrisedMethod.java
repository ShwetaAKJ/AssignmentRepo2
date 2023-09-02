public class NonParamitrisedMethod {
    public static void main(String[] args) {
        NonParamitrisedMethod n1=new NonParamitrisedMethod();
        n1.sum();
        NonParamitrisedMethod.add();
    }
    public static void add()
    {
        System.out.println("addition of two nums by static method is "+(2+5));
    }
    public void sum()
    {
        System.out.println("addition of two nums by non static method is "+(3+6));
    }
}
