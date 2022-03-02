import java.util.Scanner;

public class IncrementOperator {

    public static void main(String args[]){

        //take a number from user
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        x = x+1;
        System.out.println("x is " + x);

        x += 2;
        System.out.println("x is " + x);

        x++; //post increment
        System.out.println("x is " + x);
        ++x; // pre increment

        System.out.println("x is " + x);

        int y = 6;

        y--;

        System.out.println("y is " + y);

         int a,b,c;

         a=b=c = 5;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        b = 10;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);





    }
}
