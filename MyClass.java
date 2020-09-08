import java.util.*;
class Supplier{
    private int pepsiPrice;
    private int cocaColaPrice;
    private int spritePrice;
    private int pepsiQuantity;
    private int cocaColaQuantity;
    private int spriteQuantity;
    private int totalCollection;
    //Inital price and quantity that supplier has when he chooses to open store on day 1
    Supplier(int pepsiPrice,int cocaColaPrice,int spritePrice,int pepsiQuantity,int cocaColaQuantity,int spriteQuantity){
        this.pepsiPrice=pepsiPrice;
        this.cocaColaPrice=cocaColaPrice;
        this.spritePrice=spritePrice;
        this.pepsiQuantity=pepsiQuantity;
        this.cocaColaQuantity=cocaColaQuantity;
        this.spriteQuantity=spriteQuantity;
        this.totalCollection=0;
    }
    
    //Getters and setters for all variables;
    public int getPepsiPrice(){
        return this.pepsiPrice;
    }
       public int getcocaColaPrice(){
        return this.cocaColaPrice;
    }
       public int getSpritePrice(){
        return this.spritePrice;
    }
       public int getPepsiQuantity(){
        return this.pepsiQuantity;
    }
       public int getcocaColaQuantity(){
        return this.cocaColaQuantity;
    }
       public int getSpriteQuantity(){
        return this.spriteQuantity;
    }
      public int getTotalCollection(){
          return this.totalCollection;
      }
      
      public void setTotalCollection(int x){
          this.totalCollection=x;
      }
      public void setPepsiPrice(int x){
        this.pepsiPrice=x;
    }
    
       public void setcocaColaPrice(int x){
        this.cocaColaPrice=x;
    }
       public void getSpritePrice(int x){
         this.spritePrice=x;
    }
       public void setPepsiQuantity(int x){
         this.pepsiQuantity=x;
    }
       public void setCocaColaQuantity(int x){
         this.cocaColaQuantity=x;
    }
       public void setSpriteQuantity(int x){
         this.spriteQuantity=x;
    }
    
}

class Buyer{
    private int amountDeposited;
    private int pepsiQuantity;
    private int cocaColaQuantity;
    private int spriteQuantity;
    
    Buyer(){
        this.amountDeposited=0;
        this.pepsiQuantity=0;
        this.cocaColaQuantity=0;
        this.spriteQuantity=0;
    }
    
    //Getters and Setter
    
    public int getAmountDeposited(){
        return this.amountDeposited;
        
    }
    
    public int getPepsiQuantity(){
        return this.pepsiQuantity;
    }
    
    public int getcocaColaQuantity(){
        return this.cocaColaQuantity;
    }
    
    public int getSpriteQuantity(){
        return this.spriteQuantity;
    }
    
     public void setAmountDeposited(int x){
         this.amountDeposited=x;
        
    }
    
    public void setPepsiQuantity(int x){
         this.pepsiQuantity=x;
    }
    
    public void setcocaColaQuantity(int x){
         this.cocaColaQuantity=x;
    }
    
    public void setSpriteQuantity(int x){
        this.spriteQuantity=x;
    }
    
    
}
public class MyClass {
    public static void main(String args[]) {
        //Assumption made:= Supplier initialized each time program runs better way would be to store in file and get the previous data
        Scanner sc=new Scanner(System.in);
        Supplier s1=new Supplier(25,35,45,10,10,10);
       System.out.println("MENU");
       System.out.println("Are you a buyer or a supplier?");
       System.out.println("1. Supplier");
       System.out.println("2. Buyer");
       int choice=sc.nextInt();
        if(choice==1){
            System.out.println("You can reset quantities now");
            System.out.println("Options to choose from");
            System.out.println("1: Pepsi");
            System.out.println("2: CocaCola");
            System.out.println("3: Sprite");
            System.out.println("4: Exit");
            while(true){
            int c2=sc.nextInt();
            switch(c2){
                case 1:
                System.out.println("Enter quantity to be added or subtracted,if subtraction do with - sign");
                int w=sc.nextInt();
                s1.setPepsiQuantity(s1.getPepsiQuantity()+w);
                System.out.println("Enter new choice from 1,2,3,4 (4 to exit)");
                break;
                
                case 2:
                System.out.println("Enter quantity to be added or subtracted,if subtraction do with - sign");
                int w1=sc.nextInt();
                s1.setCocaColaQuantity(s1.getcocaColaQuantity()+w1);
                 System.out.println("Enter new choice from 1,2,3,4 (4 to exit)");
                break;
                
                case 3:
                System.out.println("Enter quantity to be added or subtracted,if subtraction do with - sign");
                int w2=sc.nextInt();
                s1.setSpriteQuantity(s1.getSpriteQuantity()+w2);
                 System.out.println("Enter new choice from 1,2,3,4 (4 to exit)");
                break;
                
                case 4:
                System.exit(0);
                break;
                
                default:
                System.out.println("Enter values in 1,2,3,4");
                break;
              }    
            }
        }
        else{
            System.out.println("Options to choose from");
            System.out.println("1: Pepsi,price=25");
            System.out.println("2: CocaCola,price=35");
            System.out.println("3: Sprite,price=45");
            System.out.println("4: Exit");
            System.out.println("Only coins of denomination 1,5,10,25 are accepted if any other denomination entered transaction cancelled");
             Buyer b1=new Buyer();
             while(true){
            int c=sc.nextInt();
            switch(c){
                case 1:
                if(s1.getPepsiQuantity()<1){
                    System.out.println("Not enough pepsi stock");
                    break;
                }    
                System.out.println("You need to enter 25 rupees in total");
                int tempAdded=0;
                while(tempAdded<25){
                    int entered=sc.nextInt();
                    if(entered!=1 && entered!=5 && entered!=10 && entered!=25){
                        System.out.println("Wrong denomination entered returning all money");
                        tempAdded=0;
                        break;
                    }
                    if(tempAdded<25){
                    System.out.println("Do you want to break the transaction (Y/n)");
                    String s=sc.next();
                    if(s.equals("y")){
                        System.out.println("Returning all money"+ tempAdded);
                        break;
                    }
                    
                    }
                    tempAdded+=entered;
                }
                
                if(tempAdded>=25){
                    if(tempAdded>25){
                        System.out.println("Returning"+(tempAdded-25)+"to you");
                        tempAdded=25;
                    }
                    int t1=s1.getPepsiQuantity();
                    s1.setPepsiQuantity(t1-1);
                    int supplierMoney=s1.getTotalCollection();
                    s1.setTotalCollection(supplierMoney+25);
                    b1.setAmountDeposited(b1.getAmountDeposited()+25);
                    b1.setPepsiQuantity(b1.getPepsiQuantity()+1);
                
                    System.out.println("Enter new value of choice from 1,2,3,4 (4 to exit)");
                }
                break;
                
                case 2:
                    
                   if(s1.getcocaColaQuantity()<1){
                    System.out.println("Not enough cocaCola stock");
                    break;
                }    
                System.out.println("You need to enter 35 rupees in total");
                int tempAdded1=0;
                while(tempAdded1<=35){
                    int entered=sc.nextInt();
                    if(entered!=1 && entered!=5 && entered!=10 && entered!=25){
                        System.out.println("Wrong denomination entered returning all money");
                        tempAdded1=0;
                        break;
                    }
                    System.out.println("Do you want to break the transaction (Y/n)");
                    String s=sc.next();
                    if(s.equals("y")){
                        System.out.println("Returning all money"+ tempAdded1);
                        break;
                    }
                    else{
                    tempAdded1+=entered;
                    }
                }
                
                if(tempAdded1>=35){
                    if(tempAdded1>35){
                        System.out.println("Returning"+(tempAdded1-35)+"to you");
                        tempAdded1=35;
                    }
                    int t1=s1.getcocaColaQuantity();
                    s1.setCocaColaQuantity(t1-1);
                    int supplierMoney=s1.getTotalCollection();
                    s1.setTotalCollection(supplierMoney+35);
                    b1.setAmountDeposited(b1.getAmountDeposited()+35);
                    b1.setPepsiQuantity(b1.getcocaColaQuantity()+1);
                    System.out.println("Enter new value of choice from 1,2,3,4 (4 to exit)");
                    
                }
                break; 
                    case 3:
                    
                   if(s1.getSpriteQuantity()<1){
                    System.out.println("Not enough Sprite stock");
                    break;
                }    
                System.out.println("You need to enter 45 rupees in total");
                int tempAdded2=0;
                while(tempAdded2<=45){
                    int entered=sc.nextInt();
                    if(entered!=1 && entered!=5 && entered!=10 && entered!=25){
                        System.out.println("Wrong denomination entered returning all money");
                        tempAdded2=0;
                        break;
                    }
                    System.out.println("Do you want to break the transaction (Y/n)");
                    String s=sc.next();
                    if(s.equals("y")){
                        System.out.println("Returning all money"+ tempAdded2);
                        break;
                    }
                    else{
                    tempAdded2+=entered;
                    }
                }
                
                if(tempAdded2>=45){
                    if(tempAdded2>45){
                        System.out.println("Returning"+(tempAdded2-45)+"to you");
                        tempAdded2=45;
                    }
                    int t1=s1.getSpriteQuantity();
                    s1.setSpriteQuantity(t1-1);
                    int supplierMoney=s1.getTotalCollection();
                    s1.setTotalCollection(supplierMoney+45);
                    b1.setAmountDeposited(b1.getAmountDeposited()+45);
                    b1.setSpriteQuantity(b1.getSpriteQuantity()+1);
                  System.out.println("Enter new value of choice from 1,2,3,4 (4 to exit)");
                    
                }
                break;  
                
                case 4:
                System.out.println("Summary:");
                System.out.println("Pepsi bought"+b1.getPepsiQuantity());
                 System.out.println("CocaCola bought"+b1.getcocaColaQuantity());
                  System.out.println("Sprite bought"+b1.getSpriteQuantity());
                   System.out.println("Total amount"+b1.getAmountDeposited());
                   System.exit(0);
                   break;
                   
                   default:
                   System.out.println("Enter digits in 1,2,3,4");
                   break;
            }
        
            
            
            
            
           
        }   
        }
    }
}
