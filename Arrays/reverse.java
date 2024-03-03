package Arrays;

public class reverse {
    public static int reverse(int numbers[]){
        int first = 0 , last = numbers.length-1;

        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[] ={12,15,16,78,34};

        reverse(numbers);
        for(int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }
    }
}
