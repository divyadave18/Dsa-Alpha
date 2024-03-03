package Arrays;

public class subarray {
    public static void subarray(int numbers[]){
        int currsum=0; 
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0;i<=numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                // for(int k=i;k<=j;k++){
                //     System.out.print(numbers[k] + " ");
                //     currsum += numbers[k];
                    
                // }
                // System.out.println(currsum);

                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
          System.out.println("maximum sum is " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5};
        subarray(numbers);
    }
}
