package com.meawallet.mareks.ui;


import com.meawallet.mareks.dto.CreateUserInRequest;
import com.meawallet.mareks.ui.exception.UserValidationException;

import java.util.Scanner;

public class UserInput {

    public int getMenuAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter menu action: ");
        return scanner.nextInt();
    }

    public CreateUserInRequest getCreateUserInRequest() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter user name:");
            String name = scanner.nextLine();
            System.out.println("Please enter user surname:");
            String surname = scanner.nextLine();
            System.out.println("Please enter user email:");
            String email = scanner.nextLine();
            System.out.println("Please enter user phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please enter user town:");
            String town = scanner.nextLine();
            return new CreateUserInRequest(name, surname, email, phoneNumber, town);
        } catch (NumberFormatException e) {
            throw new UserValidationException("User age incorrect, message: " + e.getMessage());
        }
    }

    public Integer getUserId() {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter user id: ");
        return scanner.nextInt();
    }
}

