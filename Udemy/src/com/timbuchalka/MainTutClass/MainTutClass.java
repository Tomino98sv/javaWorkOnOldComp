package com.timbuchalka.MainTutClass;

import java.util.Scanner;

public class MainTutClass {

    public static void main(String [] args){

        //Car porsche = new Car();
        //Car holder = new Car();
        Scanner input = new Scanner(System.in);
        //System.out.println("Type model ");
        //String modelP = input.nextLine();
        //input.nextLine();
        //porsche.setModel(modelP);
        //System.out.println("Model is " + porsche.getModel());

//        BankAcc client1 = new BankAcc("123456789","0958 568 789",15,"John Falco","John@Falco.com","Johny==789");
//
//        BankAcc client2 = new BankAcc("987654321","0958 456 159",150000,"Jeff Bezos","Jeff@Bezos.com","Jeff=!159");
//
//        BankAcc client3 = new BankAcc("111222333","0958 587 654",2500,"Tim Buchalka","Tim@Buchalka.com","Tim>=654");
//
//        System.out.println("Type name and password");
//
//        System.out.println("Name:");
//        String CurrentName = input.nextLine();
//        //input.nextLine(); // netreba lebo print scannera prerusi
//        System.out.println("Password:");
//        String CurrentPassword = input.nextLine();
//        //input.nextLine();
//
//        int count;
//        char backspace = ' ';
//        int witchClient=0;
//        boolean login = false;
//        if (CurrentName.equals(client1.getCustomerName()) && CurrentPassword.equals(client1.getPassword())){
//            witchClient=1;
//            login = true;
//        }
//        if (CurrentName.equals(client2.getCustomerName()) && CurrentPassword.equals(client2.getPassword())){
//            witchClient=2;
//            login = true;
//        }
//        if (CurrentName.equals(client3.getCustomerName()) && CurrentPassword.equals(client3.getPassword())){
//            witchClient=3;
//            login = true;
//        }
//
//
//        if (login == true) {
//
//            System.out.println("Login successed");
//            while (backspace != 'Q') {
//                System.out.println("Type if you want deposit(0) or withdrawal(1)");
//                int choice = input.nextInt();
//                if (choice == 0) {
//                    System.out.println("How much you want to deposit");
//                    count = input.nextInt();
//                    if (witchClient == 1) {
//                        client1.deposit(count);
//                    }
//                    if (witchClient == 2) {
//                        client2.deposit(count);
//                    }
//                    if (witchClient == 3) {
//                        client3.deposit(count);
//                    }
//                } else if (choice == 1) {
//                    System.out.println("How much you want to withdrawal");
//                    count = input.nextInt();
//                    if (witchClient == 1) {
//                        client1.withdrawal(count);
//                    }
//                    if (witchClient == 2) {
//                        client2.withdrawal(count);
//                    }
//                    if (witchClient == 3) {
//                        client3.withdrawal(count);
//                    }
//                } else {
//                    System.out.println("WRONG INPUT");
//                }
//                System.out.println("For quit press Q");
//                backspace = input.next().charAt(0);
//                input.nextLine();
//            }
//
//        }else{
//            System.out.println("Not found such a client");
//        }
//
//
//        input.close();

        VipCustomer person1 = new VipCustomer();
        VipCustomer person2 = new VipCustomer("Cimbalka",150.05);
        VipCustomer person3 = new VipCustomer("Elon Musk",180.50,"Musk@Elon.com");

        System.out.println(person1.getName()+"\n"+person1.getEmail()+"\n"+person1.getCreditLimit());
        System.out.println("\n"+person2.getName()+"\n"+person2.getEmail()+"\n"+person2.getCreditLimit());
        System.out.println("\n"+person3.getName()+"\n"+person3.getEmail()+"\n"+person3.getCreditLimit());
    }



}
