import java.util.*;
class kadans{
    public static void kadans(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int numbers[] = new int[10];
        for(int i=0;i<=n;i++){
            numbers[i] = sc.nextInt();
        }
      
        kadans(numbers);
    }
}