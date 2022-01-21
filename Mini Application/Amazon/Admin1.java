

public class Admin1 {  
    
    public static void Login(){
        System.out.println("Welcome to admin login");
        System.out.println("Enter user name");
        String name=Main1.sc.nextLine();
        System.out.println("Enter password");
        String password=Main1.sc.nextLine();
        if(name.equals("admin") && password.equals("admin")){
            adminpage();
            
  
        }
    }

    public static void adminpage() {
        System.out.println("1 Approval/Rejection");
        System.out.println("2 Add/Remove Merchant \n 3 Back \n 4 Exit");
        System.out.println("Enter your choice");
        int n =Integer.parseInt(Main1.sc.nextLine());
        if (n == 1) {
            approval();
        } else if (n == 2) {
            //addRemove();
        }
        else if(n==3){
            Main1.home();
        }
        else if(n==4){
            System.exit(0);
        }
        else{
            System.out.println("Invalid input try again");
            adminpage();
        }
    }

    public static void approval() {
        for (int i = 0; i < Main1.merchants.size(); i++) {
             System.out.print("\033[H\033[2J");
             
            if (Main1.merchants.get(i).status.equals("Pending")) {
                System.out.println("User : " + Main1.merchants.get(i).name);
                System.out.println("1 Approval \n  Any other number for Rejection :");
                int n = Integer.parseInt(Main1.sc.nextLine());
                if (n == 1) {
                    Main1.merchants.get(i).status = "Approved";
                    System.out.printf("Merchant \"%s\" has been Approved\n", Main1.merchants.get(i).name);
                    System.out.println("Press enter to continue");
                    Main1.sc.nextLine();
                    continue;
                 } else {
                    Main1.merchants.get(i).status = "Rejected";
                    System.out.println("User Rejected");
                    System.out.println("Press enter to continue");
                    Main1.sc.nextLine();
                }
            }
        }
        System.out.println("Merchants Waiting for Approval :- 0");
        adminpage();
    }

    
}
