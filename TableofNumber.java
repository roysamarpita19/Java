import java.util.*;




public class TableofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int table=n;
        System.out.println("The table of "+n+" is :");
        for (int i=0; i<=10; i++) {
            table=n*i;
            
            System.out.println(n+"*"+i+ "="+table);
              
        }
        
    }

    
}
