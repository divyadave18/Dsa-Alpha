package Arrays;

public class binarysearch {
    public static int binary(int numbers[],int key){
       int start = 0,end = numbers.length-1;
       while(start<=end){
         int mid = start+end/2;
          if(numbers[mid] == key){
            return mid;
          }
          if(numbers[mid] > key){
             end = mid-1;
          }else{
            start= mid+1;
          }
       }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {23,45,61,77,79,88};
        int key = 88;
        System.out.println("numbers found at index "+ binary(numbers,key));
    }
}
