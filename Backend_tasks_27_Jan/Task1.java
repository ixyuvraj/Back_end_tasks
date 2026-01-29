import java.io.*;
import java.util.*;

public class Task1{
    public static void main(String[] args){

        Integer wordCount = 0;
        Integer sentenceCount = 0;
        Integer characterCount = 0;
        
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Backend_tasks\\Backend_tasks_27_Jan\\file.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();
            System.out.println(everything);


            //counting the characters
            characterCount = everything.replaceAll("[^a-zA-Z.!?]","").length();


            //counting the words
            String[] words = everything.split("\\s+");

            //converting words to wordmap            
            HashMap<String, Integer> wordMap = new HashMap<>();
            for(String word: words){
                String w = word.replaceAll("[^a-zA-Z]","").toLowerCase();
                if(w.length()>0){
                    wordMap.put(w, wordMap.getOrDefault(w,0)+1);
                }
            }

            //sort the wordmap
            ArrayList<HashMap.Entry<String, Integer>> wordList = new ArrayList<>(wordMap.entrySet());
            wordList.sort(
                Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey())
            );


            wordCount = words.length;


            //counting sentences
            String[] sentences = everything.split("[!?.]+");
            for(String s : sentences){
                if(s.trim().length()>0){
                    sentenceCount++;
                }
            }

            //sroting reverse of each sentence in araylist
            ArrayList<String> reverseSentences = new ArrayList<>();
            for(int i = 0; i<sentences.length; i++){
                String[] sent = sentences[i].trim().split("\\s+");
                StringBuilder result = new StringBuilder();

                for(String word: sent){
                    result.append(new StringBuilder (word).reverse()).append(" ");
                }

                reverseSentences.add(result.toString().trim());
            }



            System.out.println("Number of characters: " + characterCount);
            System.out.println("\n\n");

            System.out.println("Number of words: " + wordCount);
            System.out.println("\n\n");

            System.out.println("Top 5 most frequent words : ");
            int limit=Math.min(5, wordList.size());
            for(int i=0; i<limit; i++){
                Map.Entry<String, Integer> entry = wordList.get(i);
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("\n\n");

            System.out.println("Number of sentences: " + sentenceCount);
            System.out.println("\n\n");

            System.out.println("reversed sentences with word order :");
            for(int i=0; i<reverseSentences.size(); i++){
                System.out.println(reverseSentences.get(i));
            }

            
        } 

            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            catch (IOException e) {
                e.printStackTrace();
            }

        
    }
}



//debugging notes : 
// bufferreader should be inside try block
// added catch block for FileNotFoundException

//the try block automatically closes buffereader after smooth esxecution and no errors occured