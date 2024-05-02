public class Anagram_strings {
    static boolean anagram(String str, String str1){
        int count = 0;
        if(str.length()==str1.length()){
            for(int i =0;i<str.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str.charAt(i)==str1.charAt(j)){
                        count++;
                    }
                }
            }
            if(count==str.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="race";
        String str1="care";
        System.out.println(anagram(str,str1));
    }
}
