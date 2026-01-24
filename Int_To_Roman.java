public class Int_To_Roman {
    public static String values(int n){
        switch(n){
            case 1:return "I";
            case 2:return "II";
            case 3:return "III";
            case 4:return "IV";
            case 5:return "V";
            case 6:return "VI";
            case 7:return "VII";
            case 8:return "VIII";
            case 9:return "IX";
            case 10:return "X";
            case 20:return "XX";
            case 30:return "XXX";
            case 40:return "XL";
            case 50:return "L";
            case 60:return "LX";
            case 70:return "LXX";
            case 80:return "LXXX";
            case 90:return "XC";
            case 100:return "C";
            case 200:return "CC";
            case 300:return "CCC";
            case 400:return "CD";
            case 500:return "D";
            case 600:return "DC";
            case 700:return "DCC";
            case 800:return "DCCC";
            case 900:return "CM";
            case 1000:return "M";
            case 2000:return "MM";
            case 3000:return "MMM";
        }
        return "";
    }
    public static String intToRoman(int n){
        int count=0;
        int temp=n;
        while(n!=0){
            n=n/10;
            count++;
        }
        n=temp;
        StringBuilder s=new StringBuilder();
        while(n!=0){
            int power = (int) Math.pow(10, count - 1);
            int q=n/power;
            int r=q%10;
            int val=r*power;
            s.append(values(val));
            count--;
            n=n%power;
        }
        return s.toString();
    }
    public static void main(String[] args) {
        int num=3987;
        System.out.println(intToRoman(num));
    }
}
