import java.lang.*;
public class sortingTheSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sort(s));

    }
    public static String sort(String s){
        String[] given=s.split(" ");
        String[] actualArray=new String[given.length];
        for(String word:given){
            int pos=word.charAt(word.length()-1)-'0';
            String actual=word.substring(0,word.length()-1);
            actualArray[pos-1]=actual;

        }
        return String.join(" ",actualArray);
    }
}
