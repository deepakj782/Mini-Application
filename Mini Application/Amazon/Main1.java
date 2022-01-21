import java.util.*;
public class Main1 {

    static ArrayList<Merchant1> merchants=new ArrayList<>();
    static Scanner sc;
    static int a;
    static String name,password;    

   
    public static void home(){
        
        int a=0;
        sc=new Scanner(System.in);
        do{
        System.out.println(" ___________Welcome to amazon shopping__________");
        System.out.println(" 1.Admin Login \n 2.Merchant Login \n 3.User Login \n 4.Exit \n Enter your chpice");
        a =Integer.parseInt(sc.nextLine());
         
            switch(a){
                case 1:
                Admin1.Login();

                break;
                
                case 2: 
                Merchant1.merchantlogin();

                break;

                case 3:
                //userlogin();
                break;

                case 4:
                System.exit(0);
                break ;
            }
        }
        while(true);  
            
       

    }    
    
    public static void main(String args[]){

        home();
        
    }
    
}
