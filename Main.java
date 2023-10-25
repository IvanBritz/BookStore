import java.util.*;
public class Main{
   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Process p = new Process();

        boolean flag = true;
        while(flag){
            p.Choices();
            System.out.print("Enter choice:");
            int choices = sc.nextInt();
            switch(choices){

                case 1:
                p.BuyBook();
                break;

                case 2:
                p.BookList();
                break;
                
                case 3:
                System.exit(0);
                break;
            }
            

        }
        
    }
}