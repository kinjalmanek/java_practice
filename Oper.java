public class Oper {
    public static void main(String args[]){
        int x = 5;
        int y = 10;

        int z = x + y;
        int a = y - x;

        System.out.println(z);
        System.out.println(a);
        System.out.println(x-y);
        System.out.println(x/y); //will print 0

        float d = x/y;
        System.out.println(d);  // will print 0.0

        float e = (float) x/y;
        System.out.println(e); // will print 0.5

        int k = y/x;
        System.out.println(k);

        int l = 11%x; // modulus gives remainder

    }
}
