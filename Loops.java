public class Loops {

    public static void main(String args[]) {
        // for loop
        //for( <initialize>, <continue test>, <update>) {}

        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }

        //while loop
        //while(<condition>){}
        int i = 0;
        int j = 0;
        while(i < 5){
            System.out.println("0");
            i++;
        }

        //do while
        //executed once without condition matching
        int k = 0;
        do{
          System.out.println("executed");
        }while(k>10);

        //with condition matching
        int l = 0;
        do{
            System.out.println("Inside do while loop " + l);
            l++;
        }while(l<10);
    }
}
