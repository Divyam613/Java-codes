public class Duplicate_string {
    static void dupli(String str, int idx , boolean map[], StringBuilder sb){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(idx);
        if(map[ch-'a']==true){
            dupli(str, idx+1, map, sb);
        }
        else{
            map[ch-'a']=true;
            dupli(str, idx+1, map, sb.append(ch));
        }
    }
    public static void main(String[] args) {
        String str="apnacollege";
        int idx=0;
        //StringBuilder sb = new StringBuilder();
        dupli(str, idx, new boolean [26], new StringBuilder(""));
    }

}
