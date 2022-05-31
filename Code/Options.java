package Code;

public class Options {
    CreateAccount create = new CreateAccount();
    Admin admin = new Admin();
    public void check(int choice){

        switch (choice){
            case 1 ->{
               create.createAccount();
               break;
            }

            case 2 ->{
                create.Login();
                break;
            }

            case 3 ->{
                admin.admin();
                break;
            }

            case 4 ->{
                System.out.println(" Have a nice Day. ");
                System.exit(0);
            }

            default -> {
                System.out.println(" Undefine Option ");
                System.out.print(" Select Again: ");
                break;
            }

        }
    }

    public void options(){
        System.out.println(" 1. Create User Account ");
        System.out.println(" 2. Log in as User ");
        System.out.println(" 3. Log in as an Admin ");
        System.out.println(" 4. Exit ");
    }


}
