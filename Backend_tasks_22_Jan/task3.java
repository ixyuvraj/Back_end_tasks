import java.util.*;

public class task3 {
    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int n){
        return n%2==0;
    }

    public int findFactorial(int n){
        if(n<=1){
            return 1;
        }

        return n*findFactorial(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        task3 obj = new task3();
        System.out.println("Enter two numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of numbers: " + obj.add(a, b));
        System.out.println("Enter a number to check even or odd: ");
        int n = sc.nextInt();
        if(obj.isEven(n)){
            System.out.println(n + " is even.");
        }
        else{
            System.out.println(n + " is odd.");
        }
        System.out.println("Enter a number to find factorial: ");
        int f = sc.nextInt();
        System.out.println("Factorial of " + f + " is: " + obj.findFactorial(f));
        sc.close();
    }
}
