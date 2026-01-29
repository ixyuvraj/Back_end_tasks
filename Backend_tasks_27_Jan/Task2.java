import java.lang.reflect.Array;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
       String[] names = {"yuvraj", "324qr", "3asfasf", "yuvraj"};

       //converting array to ArrayList
       ArrayList<String> names1 = new ArrayList<>(Arrays.asList(names));

       //hashmap to count freq
       HashMap<String, Integer> wordMap = new HashMap<>();
       for(String s : names1){
        wordMap.put(s, wordMap.getOrDefault(s,0)+1);
       }



       System.out.println("As array : ");
       for(int i=0; i<names1.size(); i++){
        System.out.println(names1.get(i));
       }
       System.out.println("\n\n");


       System.out.println("As arraylist : ");
       System.out.println(names1);
       System.out.println("\n\n");


       System.out.println("displaying freq : ");
       for(Map.Entry<String , Integer> entry: wordMap.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
       }

       System.out.println("\n\n");


       //removing duplicates
       HashSet<String> names2 = new HashSet<>(names1);
       System.out.println("as set : ");
       System.out.println(names2);
       System.out.println("\n\n");

    }
}
