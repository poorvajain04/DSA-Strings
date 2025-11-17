public class longestPalindrome {
    public static void main(String[] args) {
        String s="aaaabbbccccdd";
        System.out.println(Palindrome(s));
    }
    public static int Palindrome(String s) {
        char[]ch=s.toCharArray();
        boolean[]b=new boolean[s.length()];
        int ans=0;
        boolean odd=false;
        for(int i=0;i<ch.length;i++){
            int count=1;
            if(b[i]) continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    b[j]=true;
                }
            }
            if(count%2==0){
                ans+=count;
            }
            else{
                ans=ans+(count-1);
                odd=true;
            }
        }
        return (odd)? ans+1:ans;
    }
}
