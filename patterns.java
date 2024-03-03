class patterns{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    public static void palindrompattern(int n){
        for(int i=1;i<=n;i++){ 
            int j;
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
       // pattern(5); 
       palindrompattern(5);
    }
}