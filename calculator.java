package muruga;

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i;



        do {

            System.out.println("enter a A value;");
            int a= scan.nextInt();
            System.out.println("enter a  B value;");
            int b= scan.nextInt();
            System.out.println("enter the operator +,-,/,%");
            String c= scan.next();


            switch (c)
            {
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    if(b==0 || a==0)
                    {
                        System.out.println("division by zero exception");
                    }
                    else {
                        System.out.println(a / b);
                        break;
                    }
                case "%":
                    System.out.println(a%b);
                    break;
                default:
                    System.out.println("invalid operator");

            }

            System.out.println("continue give 1 or not 0 ");
            i=scan.nextInt();



            } while(i==1);
        System.out.println("Thank you for using the calculator!");
        scan.close();

    }
}