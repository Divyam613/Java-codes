package apna_collage.String;

public class Sortest_path {
    static float sort(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            int dir=str.charAt(i);
            if(dir=='E'){
                y++;
            }
            else if(dir=='W'){
                y--;
            }
            else if(dir=='N'){
                x--;
            }
            else{
                y++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "ESSNWENSWE";
        System.out.println(sort(str));
    }
}
