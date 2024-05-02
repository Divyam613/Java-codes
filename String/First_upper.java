import java.util.Scanner;

public class First_upper {
    public static String lower_to_upper(String str){
        // String newstr = "";
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1; i<str.length();i++){
            // String ch = str.charAt(i);
            // if(i==0){
            //     newstr += ch.toUpperCase();
            // }
            if(str.charAt(i-1) == ' '){
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.err.println(lower_to_upper(str));
        sc.close();
    }
}
