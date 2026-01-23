import java.util.*;
public class AggressiveCow {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int start=1;
        int end=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(start<=end){
            int mid = start + (end - start) / 2;;
            if(possible(stalls,k,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static boolean possible(int[]stalls,int k,int dist){
        int count=1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                last=stalls[i];
                count++;
            }
        }

        return count>=k;
    }
    public static void main(String[] args) {
        int[] stalls={10,1,2,7,5};
        int k=3;
        System.out.println(aggressiveCows(stalls,k));
    }
}
