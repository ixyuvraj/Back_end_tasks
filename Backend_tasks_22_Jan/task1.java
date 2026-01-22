import java.util.*;

class task1{
    public static void main(String[] args){
        Integer n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        if(n>0){
            System.out.println("The number is positive.");
        }
        else if(n<0){
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is zero.");
        }

        if(n%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

        sc.close();

    }
}