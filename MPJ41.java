package myproject;

import java.io.*;
import java.util.*;

class MPJ41 {

    static Scanner sc = new Scanner(System.in);

    // Customer class
    static class Customer implements Serializable {
        int cid;
        String cname;
        double amount;

        Customer(int cid, String cname, double amount) {
            this.cid = cid;
            this.cname = cname;
            this.amount = amount;
        }

        void display() {
            System.out.println(cid + " " + cname + " " + amount);
        }
    }

    static ArrayList<Customer> list = new ArrayList<>();

    public static void main(String[] args) {

        int ch;

        do {
            System.out.println("\n1.Create  2.Deposit  3.Withdraw  4.Display  5.Save  6.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: create(); break;
                case 2: deposit(); break;
                case 3: withdraw(); break;
                case 4: display(); break;
                case 5: save(); break;
                case 6: System.out.println("Exit"); break;
                default: System.out.println("Invalid choice");
            }

        } while (ch != 6);
    }

    // Create Account
    static void create() {
        try {
            System.out.print("Enter CID (1-20): ");
            int cid = sc.nextInt();

            if (cid < 1 || cid > 20)
                throw new Exception("CID must be 1 to 20");

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();

            if (amt < 1000)
                throw new Exception("Minimum balance is 1000");

            list.add(new Customer(cid, name, amt));
            System.out.println("Account Created");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Deposit
    static void deposit() {
        try {
            System.out.print("Enter CID: ");
            int cid = sc.nextInt();

            for (Customer c : list) {
                if (c.cid == cid) {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    if (amt <= 0)
                        throw new Exception("Amount must be positive");

                    c.amount += amt;
                    System.out.println("Deposited");
                    return;
                }
            }
            System.out.println("Customer not found");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Withdraw
    static void withdraw() {
        try {
            System.out.print("Enter CID: ");
            int cid = sc.nextInt();

            for (Customer c : list) {
                if (c.cid == cid) {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    if (amt <= 0)
                        throw new Exception("Amount must be positive");

                    if (amt > c.amount)
                        throw new Exception("Insufficient balance");

                    c.amount -= amt;
                    System.out.println("Withdrawn");
                    return;
                }
            }
            System.out.println("Customer not found");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Display
    static void display() {
        for (Customer c : list) {
            c.display();
        }
    }

    // Save to file
    static void save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bank.dat"));
            oos.writeObject(list);
            oos.close();
            System.out.println("Saved to file");

        } catch (Exception e) {
            System.out.println("File error");
        }
    }
}