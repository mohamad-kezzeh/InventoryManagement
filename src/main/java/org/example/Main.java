package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
    }
    do {
        System.out.println("\n Inventory Management System");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Display all Product");
        System.out.println("Exit");
        System.out.print("Enter Your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){

        }

    }

}
