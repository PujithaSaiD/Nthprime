import java.util.*;
public class NthPrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int candidate=1;
        while(count<n){
            candidate+=1;
            boolean prime=true;
            for(int i=2;i<=(int)n/2;i++){
                if(candidate%i==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                count+=1;
            }

        }
        System.out.print(candidate);
    }
}
