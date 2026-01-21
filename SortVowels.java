import java.util.*;
public class SortVowels {
    public static void main(String[] args) {
        String word="LEetCode";
        System.out.println(sortVowels(word));
    }
    public static boolean isVowel(char c){
        return String.valueOf(c).equals("a")||String.valueOf(c).equals("e")||String.valueOf(c).equals("i")||String.valueOf(c).equals("o")||String.valueOf(c).equals("u")||String.valueOf(c).equals("A")||String.valueOf(c).equals("E")||String.valueOf(c).equals("I")||String.valueOf(c).equals("O")||String.valueOf(c).equals("U");
    }
    public static String sortVowels(String s){
        StringBuilder vowels=new StringBuilder();
        char[] arr=s.toCharArray();
        for(char c:arr){
            if(isVowel(c)){
                vowels.append(c);
            }
        }
        char[]v=vowels.toString().toCharArray();
        Arrays.sort(v);
        StringBuilder result=new StringBuilder();
        int index=0;
        for(char c:arr){
            if(isVowel(c)){
                result.append(v[index++]);
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
}
