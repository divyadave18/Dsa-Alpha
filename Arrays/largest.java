package Arrays;

public class largest {
    public static int largest(int numbers[]){
        int large = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(large < numbers[i]){  
                large = numbers[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int numbers[] ={99,98,97,23,45,56};

        
        System.out.println(largest(numbers));
    }
}
