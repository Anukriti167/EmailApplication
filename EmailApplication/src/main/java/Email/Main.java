package Email;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> mailCapacity = new HashMap<String, String>();

        System.out.println("State the maximum capacity of the mailbox: ");
        int maxCap = Integer.parseInt(scanner.nextLine());

        while(mailCapacity.size() <= maxCap){
            System.out.println("Enter the first name: ");
            String fname = scanner.nextLine();

            System.out.println("Enter the last name: ");
            String lname = scanner.nextLine();

            System.out.println("Enter the department name: ");
            String deptn = scanner.nextLine();

            String email = Email.emailID(fname, lname, deptn);
            System.out.println("The Email-id is: " + email);

            Password pword = new Password(fname);
            String password = pword.getPassword();
            System.out.println("The password is: " + password);
            mailCapacity.put(email, password);

            System.out.println("Do you wish to change your password: ");
            String option = scanner.nextLine();
            if(option.equalsIgnoreCase("Y") ){
                String o = pword.changePassword();
                System.out.println("New Password: " + o);
                if(mailCapacity.containsKey(email)){
                    mailCapacity.put(email, o);
                }
            }

            ChangeEmail changeEmail = new ChangeEmail(fname, lname);
            System.out.println("Do you want a new email address: ");
            String o = scanner.nextLine();
            String newEid = changeEmail.newEmailID(fname, lname);
            if(o.equalsIgnoreCase("y")){
                System.out.println("New Email id generated is: " + newEid);
                if(mailCapacity.containsKey(email)) {
                    String cpass = mailCapacity.get(email);
                    mailCapacity.remove(email);
                    mailCapacity.put(newEid, cpass);
                }
            }

            System.out.println("Do you wish to check the current status: ");

            String option1 = scanner.nextLine();
            if(option1.equalsIgnoreCase("y")){
                System.out.println("Do you want to know the Name: ");
                String opt1 = scanner.nextLine();
                if(opt1.equalsIgnoreCase("y")){
                    System.out.println(fname + " " + lname);
                }
                System.out.println("Do you want to know the email-address: ");
                String opt2 = scanner.nextLine();
                if(opt2.equalsIgnoreCase("y")){
                    if(mailCapacity.containsKey(email)){
                        System.out.println(email);
                    }
                    if(mailCapacity.containsKey(newEid)){
                        System.out.println(newEid);
                    }
                }
                System.out.println("Do you want to know the current MailBox Capacity: ");
                String opt3 = scanner.nextLine();
                if(opt3.equalsIgnoreCase("y")){
                    System.out.println(mailCapacity.size());
                }
            }

            System.out.println("Do you wish to continue creating email-id: ");
            String opt = scanner.nextLine();
            if(opt.equalsIgnoreCase("n")){
                System.out.println("Perfect, thanks for letting us know. Have a great day!");
                break;
            }
        }

        System.out.println("The maximum capacity of the mailbox has been filled.");

        scanner.close();
    }
}