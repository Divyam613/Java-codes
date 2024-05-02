package function;
// Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
// Note: Unlike 0/1 knapsack, you are allowed to break the item here.

public class Farctional_knapsack {
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,(a,b)->{
            double r1 = (double)a.value/a.weight;
            double r2 = (double)b.value/b.weight;
            if(r1<r2){
                return 1;
            }
            else if(r1>r2){
                return -1;
            }
            else{
                return 0;
            }
        });
        double ans=0;
        for(int i=0;i<n;i++){
            if(arr[i].weight<=W){
                ans+=arr[i].value;
                W-=arr[i].weight;
            }
            else{
                ans+=((double)arr[i].value/arr[i].weight)*W;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] wt = {10,40,20,30};
        int[] val = {60,40,100,120};
        int cap = 50;
        System.out.println(fractionalKnapsack(wt,val,cap));
    }
}
