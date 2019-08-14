package com.example.tictactoe;

public class Players {

    private static String p1Name;
    private static String p2Name;

    public static void setP1Name(String p1Name) {
        Players.p1Name = p1Name;
    }

    public static void setP2Name(String p2Name) {
        Players.p2Name = p2Name;
    }

    public static String getP1Name() {
        return p1Name;
    }

    public static String getP2Name() {
        return p2Name;
    }
}
