package app;

import mysql.HandleDB;

public class Main {
    public static void main(String[] args) {
        HandleDB handleDB = new HandleDB();
        System.out.println(handleDB.getTeamMembersBYName("Z Fighters").toString());

    }
}
