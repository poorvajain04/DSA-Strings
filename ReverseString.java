import java.lang.*;
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Poorva");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int end=sb.length()-i-1;
            char frontChar= sb.charAt(front);
            char lastChar=sb.charAt(end);
            sb.setCharAt(front,lastChar);
            sb.setCharAt(end,frontChar);
        }
        System.out.println(sb);
    }
}
