import java.util.*;

public class task2 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number : ");
        Integer n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }

        System.out.println("Even numbers are: ");
        Integer i = 1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        sc.close();

        Integer sum = n*(n+1)/2;
        System.out.println("Sum of numbers :" + sum);
    }
}

