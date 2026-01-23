import java.util.*;
public class CaseSpecificSort {
    public static String caseSort(String s) {
        List<Character> ucase=new ArrayList<>();
        List<Character> lcase=new ArrayList<>();
        char[]arr=s.toCharArray();
        for(char c:arr){
            if(Character.isUpperCase(c)){
                ucase.add(c);
            }
            else{
                lcase.add(c);
            }
        }
        Collections.sort(ucase);
        Collections.sort(lcase);
        StringBuilder result=new StringBuilder();
        int ui=0;
        int li=0;
        for(char c:arr){
            if(Character.isUpperCase(c)){
                result.append(ucase.get(ui++));
            }
            else{
                result.append(lcase.get(li++));
            }
        }
        return result.toString();

    }
    public static void main(String args[]){
        String str="MoNkEy";
        System.out.println(caseSort(str));
    }

}
