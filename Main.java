import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void patternSearch(String text, String pattern){
      ArrayList<Integer> matchedIndex = new ArrayList<Integer>();

      char [] textArray = text.toCharArray();
      char [] patternArray = pattern.toCharArray();
      boolean matched = false;
      int[] shiftTable = badCharPreprocess(patternArray);

      int i = 0;
      int j;
      while(i <= textArray.length-patternArray.length){
          j = patternArray.length - 1;
          while(j >= 0 && textArray[i+j] == patternArray[j]){
              j--;
          }
          if(j < 0){
              matchedIndex.add(i);
              i += 1;
              matched = true;
          }
          else{
              i+= Math.max(1,patternArray.length - shiftTable[patternArray[j]] );  // Shift the pattern. I think this is where you edit the suffix thing in
          }
      }
      if(matched){
          System.out.println("Text: "+ text);
          System.out.println("Pattern: "+ pattern);
          System.out.println("Your pattern has been matched at index:"+ matchedIndex);
      }
      else{
          System.out.println("Pattern did not match");
      }
    }

    public static int[] badCharPreprocess(char[] patternArray){
        int alphabetSize = 256;
        int shiftTable[] = new int[alphabetSize];

        for(int i = 0;i < patternArray.length; i++){
            shiftTable[patternArray[i]] = i;
        }

        return shiftTable;

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Type your Text please")
        // String text = (input.nextLine);
        // System.out.println("Enter the pattern you want to match");
        // String pattern = (input.nextLine);
        // patternSearch(text,pattern);
        patternSearch("i am gay gay and gay", "gay");
    }
}


