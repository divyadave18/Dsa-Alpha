package Arrays;
import java.util.*;

public class create {
    public static int linearsearch(int numbers[],int key){
            for(int i=0;i<numbers.length;i++){
                if(numbers[i] == key){
                    return i;
                }   
            }
            return -1;
    }
    public static void main(String args[]){
        int numbers[] ={99,98,97,23,45,56};
        int key = 56;

        int index = linearsearch(numbers,key);
        index = index+1;
        System.out.println("Key found at " +index);

    }
}
