package apna_collage.String;

public class Palindrom {
    static boolean palin(String n){
        for(int i=0;i<n.length();i++){
            int l =n.length();
            if(n.charAt(i)!=n.charAt(l-1-i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String n="racecar";
        
        System.out.println(palin(n));
    }
}
