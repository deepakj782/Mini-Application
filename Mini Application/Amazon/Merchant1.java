public class Merchant1 {
    
     static  String name;
       String password;  
       String status="pending";

    public Merchant1(String name, String password) 
       {
           this.name = name;
           this.password = password;
       } 

    public Merchant1(String name, String password, String status) {
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
                    signup();
                    
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

        System.out.println("Enter user name ");
        String name=Main1.sc.nextLine();

        System.out.println("Enter password ");
        String password=Main1.sc.nextLine();

        Main1.merchants.add(new Merchant1(name, password));

        System.out.println("Thanks for Signing Up ! Your Request is waiting for Approval");
        System.out.println("Press Enter to continue");
        Main1.sc.nextLine();
         Main1.home();
        

    }

    
    public static void signup() {
        
        System.out.println("\033[H\033[2J");
        System.out.print("Enter User name : ");
        String username = Main1.sc.nextLine();
        System.out.print("Enter Password : ");
        String password =Main1.sc.nextLine();

        if(username.equals(name) && password.equals(password))
        {
            System.out.println("\033[H\033[2J");
            System.out.println("User logged in succesfully....");
            Main1.sc.nextLine();
            //product();

        }
        else
        {
            System.out.println("\033[H\033[2J");
            System.out.println("Invalid input !!!");
            Main1.sc.nextLine();
            merchantlogin();
            
        }
    }

        
            
    }

    
