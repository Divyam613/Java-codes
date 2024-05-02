import java.util.*;

public class Max_length_of_concentrated_string_unique_char {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        System.out.println(maxLength(arr));
    }
    private boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
        if (set.contains(c)) {
            return false;
        }
        set.add(c);
        }
        return true;
    }
    public static int maxLength(List<String> arr) {
        List<String> res = new ArrayList<>();
        res.add("");
        int max = 0;
        for(String s : arr){
            if(!isUnique(s)) continue;
            List<String> temp = new ArrayList<>();
            for(String r : res){
                String t = r + s;
                if(isUnique(t)){
                    temp.add(t);
                    max = Math.max(max, t.length());
                }
            }
            res.addAll(temp);
        }
        return max;
    }
}
