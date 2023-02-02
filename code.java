import java.util.Scanner;
import java.lang.Math;

class Code {
    public static void main(String args[]) {
        // System.out.println("Hello");
        // int n1 = 0;
        // int n2 = 1;
        // int n3;
        // System.out.print(n1 + " " + n2);
        // for (int i = 2; i < 20; i++) {
        // n3 = n1 + n2;
        // System.out.print(" " + n3);
        // n1 = n2;
        // n2 = n3;

        // System.out.println("Prime numbers");

        // int i=0;
        // int n=0;
        // String prm = "";
        // for(i=1;i<=20;i++)
        // {
        // int count= 0;
        // for(n=i;n>=1;n--)
        // {
        // if(i%n==0)
        // {
        // count= count+1;
        // }
        // }
        // if(count==2)
        // {
        // prm = prm + i + " " ;
        // }
        // }
        // System.out.println("Prime numbers from 1 to 20 are :");
        // System.out.println(prm);

        System.out.println("Armstrong number");
        System.out.println("Enter any no to check armstrong number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = i;
        int rm=0;
        int sm=0 ;  int len = 0;
        while( i1> 0 )
        {
            i1=i1/10;
            len++;
        }
        System.out.println(len);

        i1=i;
        while(i1>0)
        {
            rm=i1%10;
            sm+= (Math.pow(rm,len));
            i1=i1/10;
        }

        if(sm==i)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("NOT Armstrong");
        }

    }
}