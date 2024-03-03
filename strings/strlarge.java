
public class strlarge {
    public static void main(String args[]){
        String fruit[] = {"mango","banana","anki"};

        String largest = fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(largest.compareTo(fruit[i]) < 0){
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
