public class Halves_Alike_vowels {
    public static boolean halvesAreAlike(String s) {
        int counta=0;
        int countb=0;
        int l=s.length();
        String a,b;
        a=s.substring(0,l/2);
        b=s.substring(l/2,l);
        for(int i=0;i<l/2;i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||
            a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'){
                counta++;
            }
        }
        for(int i=0;i<l/2;i++){
            if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'||
            b.charAt(i)=='A'||b.charAt(i)=='E'||b.charAt(i)=='I'||b.charAt(i)=='O'||b.charAt(i)=='U'){
                countb++;
            }
        }
        if(counta==countb){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s ="book";
        System.out.println(halvesAreAlike(s));
    }
}
