import java.util.Scanner;
public class primeNum
{
    

   public static void main(String arg[]){
      int i,n,count, j;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the n value : ");
      n=scanner.nextInt();
      System.out.print("Prime numbers between 1 to 10 are ");
      for(j=2;j<=n;j++){
         count=0;
         for(i=1;i<=j;i++){
            if(j%i==0){
               count++;
            }
         }
         if(count==2)
         System.out.print(j+" ");
      }
   }
}
