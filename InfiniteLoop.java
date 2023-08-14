public class InfiniteLoop {

    public static void main(String[] args) {
        // for loop
      /*  for(int i=1 ; ; i++)
        {
            System.out.println(i);

        }*/


        //do-while loop
       /* int i=0;
        do{
            i++;
            System.out.println(i+" Hello do while loop");

        }while(true);*/


        //while loop
        /*int i=0;
        while(true)
        {
            i++;
            System.out.println(i+" hi while loop");

        }*/

        //while using continue
        /*int i=0;
        while(i<10)
        {
            System.out.println(i+" hi = continue");
            if(i==5){continue;}
            i++;


        }*/


        //do while using continue
        /*int i=0;
        do {
            System.out.println(i+ " Hi Continue in do while");
            if(i==4){continue;}
            i++;
        }while(i < 10);*/

        //for loop using
        for(int i=0;i<5;)
        {
            System.out.println(i+" hi continue in for loop");
            if(i==4){continue;}
            i++;
        }

    }

}
