//you are given two string a and b you have to make a string anagram to b
package String;

import java.util.*;

//steps for making string anagram
public class Steps_sting_anagram {
    public static int minSteps(String s, String t) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                count+=arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String a = "leetcode";
        String b = "practice";
        System.out.println(minSteps(a, b));
        
    }
}
