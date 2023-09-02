public class seventeen {
    public static void main(String[] args) {
        int[] givennums={1,2,6,7};
        char[] operators={'+','-','*'};


        for(int i=0;i<givennums.length;i++)
        {
            for(int j=0;j<givennums.length;j++)
            {
                for(int l=0;l<givennums.length;l++)
                {
                    for(int m=0;m<givennums.length;m++)
                    {
                        for (int k=0; k < operators.length; k++)
                        {
                            for(int n=0; n < operators.length;n++)
                            {
                                for(int p=0; p < operators.length;p++)
                                {
                                    int outvalue=0,fval=0,sval=0;

                                    if((char) operators[k]=='+')
                                    {
                                        fval=givennums[i]+givennums[j];

                                    } else if ((char) operators[k]=='*') {
                                        fval=givennums[i]*givennums[j];
                                    } else if ((char) operators[k]=='-') {
                                        fval=givennums[i]-givennums[j];
                                    }//above for first operator ....


                                    if((char) operators[n]=='-')
                                    {
                                        sval=fval-givennums[l];
                                    } else if ((char) operators[n]=='+') {
                                        sval=fval+givennums[l];
                                    } else if ((char) operators[n]=='*') {
                                        sval=fval*givennums[l];
                                    }//above for second operator's possibilities....

                                    if((char) operators[p]=='*')
                                    {
                                        outvalue=(sval)*givennums[m];
                                    } else if ((char) operators[p]=='+') {
                                        outvalue=(sval)+givennums[m];
                                    } else if ((char) operators[p]=='-') {
                                        outvalue=(sval)-givennums[m];
                                    }//above for third operator's combination...

                                  //  System.out.print("final output is:  "+outvalue);
                                   // System.out.println(" just calculations: "+(6-1*2+7));
                                   // System.out.println("just cal with brackets:"+(((6-1)*2)+7));
                                    if (outvalue == 17) {
                                        System.out.println(" correct expression is: "+givennums[i]+""+(char) operators[k]+""+
                                                givennums[j]+""+(char) operators[n]+""+givennums[l]+""+(char) operators[p]+""+givennums[m]);


                                    }
                                }
                            }

                        }
                    }
                }
               

            }
        }


    }

}
