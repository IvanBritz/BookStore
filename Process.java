import java.util.*;
public class Process{
    public static void Choices(){
        System.out.println("=======Welcome to bookstore=======");
        System.out.println("1. Buy books");
        System.out.println("2. Book List");
        System.out.println("3. Exit");
        System.out.println("==================================");
    }

    public static void BuyBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you choice:");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("How many do you want to buy:");
            int qt = sc.nextInt();
            int price =1000;
            Books b1 = new Books(qt, "Harry Potter and the Sorcerer's Stone", price, 8, "Deliver");
            int tp = qt*price;
             System.out.println("=====================You Official Receipt=============================");
            System.out.println("quantity" + b1.getQuantity() + "\nBook name: " + b1.getBooks()+"\nBook Size: " + b1.getSize() + "\nDelivery: " + b1.getDelivery() + "\nprice: " + b1.getPrice() + "\nTotal price: "+tp);
        }
        else if(ch == 2){
            System.out.print("How many do you want to buy:");
            int qt = sc.nextInt();
            int price =1500;
            Books b2 = new Books(qt, "Harry Potter and the Half-blood Prince", price,8, "Deliver");
            int tp = qt*price;
             System.out.println("=====================You Official Receipt=============================");
            System.out.println("quantity" + b2.getQuantity() + "\nBook name: " + b2.getBooks() + "\nBook Size: " + b2.getSize() + "\nDelivery: " + b2.getDelivery() + "\nprice: " + b2.getPrice() + "\nTotal price: "+tp);
        
        }
        else if(ch == 3){
            System.out.print("How many do you want to buy:");
            int qt = sc.nextInt();
            int price =2000;
            Books b3 = new Books(qt, "Harry Potter and the Order of the Phoenix", price,8, "Deliver");
            int tp = qt*price;
            System.out.println("=====================You Official Receipt=============================");
            System.out.println("quantity" + b3.getQuantity() + "\nBook name: " + b3.getBooks() + "\nBook Size: " + b3.getSize() + "\nDelivery: " + b3.getDelivery() + "\nprice: " + b3.getPrice() + "\nTotal price: "+tp);
        
        }
        else if(ch == 4){
            System.out.print("How many do you want to buy:");
            int qt = sc.nextInt();
            int price =2500;
            Books b4 = new Books(qt, "Harry Potter and the Philosopher's Stone", price,8, "Deliver");
            int tp = qt*price;
             System.out.println("=====================You Official Receipt=============================");
            System.out.println("quantity" + b4.getQuantity() + "\nBook name: " + b4.getBooks() + "\nBook Size: " + b4.getSize() + "\nDelivery: " + b4.getDelivery() + "\nprice: " + b4.getPrice() + "\nTotal price: "+tp);
        
        }
        else if(ch == 5){
            System.out.print("How many do you want to buy:");
            int qt = sc.nextInt();
            int price =3000;
            Books b5 = new Books(qt, "Harry Potter and the Chamber of Secrets", price,8, "Deliver");
            int tp = qt*price;
            System.out.println("=====================You Official Receipt=============================");
            System.out.println("quantity" + b5.getQuantity() + "\nBook name: " + b5.getBooks() + "\nBook Size: " + b5.getSize() + "\nDelivery: " + b5.getDelivery() + "\nprice: " + b5.getPrice() + "\nTotal price: "+tp);
        
        }
        else{
            System.out.println("Invalid Input.");
        }
    }

        public static void BookList(){
            System.out.println("=====================================================================");
            System.out.println("[1] Harry Potter and the Sorcerer's Stone"+" - Price: 1000");
            System.out.println("[2] Harry Potter and the Half-blood Prince"+" - Price: 1500");
            System.out.println("[3] Harry Potter and the Order of the Phoenix"+" - Price: 2000");
            System.out.println("[4] Harry Potter and the Philosopher's Stone"+" - Price: 2500");
            System.out.println("[5] Harry Potter and the Chamber of Secrets"+" - Price: 3000");
            System.out.println("=====================================================================");
    
        }

}