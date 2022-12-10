package day24_CustomMethod_Return;

public class task1 {
    public static void main(String[] args) {

        int  str =frequencyOfWord("Java java java python python","java");
        System.out.println(str);
    }
    public static int frequencyOfWord (String sentence, String word){
        String result = "";
        sentence=sentence.toLowerCase();
       String [] str =sentence.split(" ");
        int count = 0;

        for (String each : str) {
            if (each.contains(word)){
                count++;
            }
        }
        return count;
    }


}








/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */