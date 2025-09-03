package com.sqabatch24.javadasar;

import java.util.ArrayList;

public class App {

    public static void ifTanpaElse() {
        int umur = 30;

        if (umur >= 25) {
            System.out.println("Anda keterima");
        }

        System.out.println("Terimakasih");
    }

    public static void ifDenganElse() {
        int umur = 26;

        if (umur >= 25) {
            System.out.println("Anda keterima");
        } else {
            System.out.println("Coba kembali");
        }

        System.out.println("Terimakasih");
    }

    public static void elseIf(){
        int nilai = 39; 

        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 55) {
            System.out.println("C");
        } else if (nilai >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Ups!!!");
        }
    }

    public static boolean validateUsername(String username) {
        String usernameFromDB = "andikabudi";
        return usernameFromDB.equals(username);
    }

    public static boolean validatePassword(String password) {
        String passwwordFromDB = "p#ssw0rd67";
        return passwwordFromDB.equals(password);
    }

    public static boolean validateRole(String role) {
        String roleFromDB = "admin";
        return roleFromDB.equals(role);
    }

    public static boolean isLoginValid(ArrayList<String> validate) {
        return validate.size() == 0;
    }

    public static void nestedIf() {
        String usernameFromUser = "andikabudi11";
        String passwordFromUser = "p#ssw0rd67";
        String roleFromUser = "staff";
        ArrayList<String> errorMessage = new ArrayList<String>();

        if (!validateUsername(usernameFromUser)) {

            errorMessage.add("invalid username");
        }

        if (!validatePassword(passwordFromUser)) {
            errorMessage.add("inavlid your password");
        }

        if (!validateRole(roleFromUser)) {
            errorMessage.add("invalid your role");
        }

        if (errorMessage.size() == 0) {
            System.out.println("Login berhasil");
        } else {
            System.out.println(errorMessage);
            errorMessage.clear();
            ;
        }
    }

     public static void NestedIf() {
        String usernameFromUser = "andikabudi";
        String passwordFromUser = "p#ssw0rd67";
        String roleFromUser = "user";

        String usernameFromDB = "andikabudi";
        String passwordFromDB = "p#ssw0rd67";
        String roleFromDB = "staff";

       if (!usernameFromDB.equals(usernameFromUser)) {
        System.out.println("Username anda salah");
    } else if (!passwordFromDB.equals(passwordFromUser)) {
        System.out.println("Password anda salah");
    } else if (!roleFromDB.equals(roleFromUser)) {
        System.out.println("Permission denied! Role tidak sesuai");
    } else {
        System.out.println("Anda berhasil login");

    }
}
    public static void main(String[] args) {
        // ifTanpaElse();
        // ifDenganElse();
        // elseIf();
        // NestedIf();
        nestedIf();
    }
}

