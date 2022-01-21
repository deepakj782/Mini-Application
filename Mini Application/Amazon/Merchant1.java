

public class Merchant1 {
    
       String name;
       String password;  
       String status="pending";

    

    public Merchant1(String name, String password) {
        this.name = name;
        this.password = password;
        this.status = status;  
    }

    public static void merchantlogin(){
        System.out.println("__Welcome to Merchant Page__");
        System.out.println("1.Sign in \n 2.Sign up \n 3.Back \n 4.Exit \n Enter your choice");
        int a=Integer.parseInt(Main1.sc.nextLine());
        do
        {
            switch(a){
                case 1:
                    signin();
                case 2:

                case 3:
                //Main1.public static void main(String[] args) {
                    
                
                case 4:
                System.exit(0);
                default:
                

            }
        }
        while(true);
    }

    public static void signin(){
        System.out.println("Welcome to New user  ");

        System.out.println("Enter your name ");
        String name=Main1.sc.nextLine();
        System.out.println("Enter password ");
        String password=Main1.sc.nextLine();
        Main1.merchants.add(new Merchant1(name, password));
        System.out.println("Thanks for Signing Up ! Your Request is Pending for Approval");
        System.out.println("Press Enter to continue");
        Main1.sc.nextLine();
        Main1.home();
        

    }

    

    }
    

