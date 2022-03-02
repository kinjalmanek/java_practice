public class IfElse {
    public static void main(String args[]){
        int i=5;
        if(i<5){
            System.out.println("i is less than 5");
        }
        else if(i>5){
            System.out.println("i is greater than 5");
        }
        else{
            System.out.println("i is equal to 5");
        }

        switch (i){
            case 1: {
                System.out.println("i = 1");
                break;
            }
            case 2:{
                System.out.println("i = 2");
                break;
            }
            case 5:{
                System.out.println("i = 5");
                break;
            }
            default:{
                System.out.println("default");
            }
        }
    }
}
