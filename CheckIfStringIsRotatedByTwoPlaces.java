public class CheckIfStringIsRotatedByTwoPlaces {
    public static void main(String[] args) {
        String s1="leetcode";
        String s2="deleetco";
        System.out.println(rotated(s1,s2));

    }
    public static boolean rotated(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        String right=s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
        String left=s1.substring(2)+s1.substring(0,2);
        if(s2.equals(right)||s2.equals(left)) return true ;
        return false;
    }
}
