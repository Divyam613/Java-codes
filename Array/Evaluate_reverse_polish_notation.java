package Array;

public class Evaluate_reverse_polish_notation {
    public int evalRPN(String[] tokens) {
        int n=  tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }
            else if(tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        tokens = ["2","1","+","3","*"];
        System.out.println(evalRPN(tokens));
    }
}
