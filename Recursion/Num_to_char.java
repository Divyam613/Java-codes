public class Num_to_char {
    static String ch[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void main(String[] args) {
        int n = 1927;
        charecter(n);
    }

    public static void charecter(int n) {
        if (n == 0) {
            return;
        }
        int lastD = n % 10;
        charecter(n / 10);
        System.out.print(ch[lastD]+" ");
    }
}
