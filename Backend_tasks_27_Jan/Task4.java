import java.util.*;
import java.io.*;



public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Number> number = new ArrayList<>();
        ArrayList<String> invalidInputs = new ArrayList<>();

        System.out.println("Enter numbers (type 'exit' to finish :");

        while(true){
            String input = sc.next().trim();
            if(input.equals("exit")){
                break;
            }

            try{
                if(input.contains(".")){
                    Double d = Double.valueOf(input);
                    number.add(d);
                }

                else{
                    Integer i = Integer.valueOf(input);
                    number.add(i);
                }
            }

            catch(NumberFormatException e){
                invalidInputs.add(input);
            }
        }

        sc.close();

        int intSum = 0;
        int intCount = 0;
        double floatSum = 0;
        int floatCount = 0;

        for(Number n : number){    
            if( n instanceof Integer){
                intSum += n.intValue();
                intCount++;
            }
            else if(n instanceof Double){
                floatCount++;
                floatSum += n.doubleValue();
            }
        }

        System.out.println("Number of Integer : " + intCount);
        System.out.println("Sum of integers : "+intSum);
        System.out.println("\n\n");

        System.out.println("Number of double : "+floatCount);
        System.out.println("Average of float : " + (floatSum/floatCount));
        System.out.println("\n\n");

        if(!invalidInputs.isEmpty()){
            System.out.println("Invalid logs : ");
            for(String s : invalidInputs){
                System.out.println(s);
            }
        }


    }
}
