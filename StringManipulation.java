public class StringManipulation {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        //Concatenate the two strings
        String s=s1+" "+s2;
        System.out.println(s);
        //Length of the given string
        System.out.println(s2.length());
        //Print individual letters of the string
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
        //compare the two strings
        if(s1.compareTo(s2)==0){
            System.out.println("Matched");
        }
        if(s1.compareTo(s2)>0){
            System.out.println("Some characters matched");
        }
        else{
            System.out.println("Not matched");
        }
        String sentence="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(sentence.substring(7,15));
    }
}
