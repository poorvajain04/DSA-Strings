public class CheckStringAsPangram {
    public static void main(String[] args) {
        String s="thebrownfoxquicklyjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String sentence) {
        for(char i='a'; i<='z';i++){
            if(!sentence.contains(String.valueOf(i))) return false;
        }
        return true;
    }
}
