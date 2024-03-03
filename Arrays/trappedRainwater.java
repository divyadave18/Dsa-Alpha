package Arrays;

public class trappedRainwater {
    public static int trappedwater(int height[]){
        int n= height.length;
        //max left side height
        int maxleft[] = new int[n];
        maxleft[0] = height[0];
        for(int i=1;i<n;i++){
            maxleft[i] = Math.max(height[i], maxleft[i-1]);
        }
        //max right side height
        int maxright[] = new int[n];
        maxright[n-1] = height[n-1];
        for(int i=n-2;i>0;i--){
            maxright[i] = Math.max(height[i],maxright[i+1]);
        }
        // calculte water level
        int watertrapped = 0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(maxleft[i],maxright[i]);
             watertrapped += waterlevel-height[i];
        }
        return watertrapped;
    
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Watertrapped is" +trappedwater(height));
    }
}
