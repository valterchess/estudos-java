package com.princeton.firstpart.cap1;

public class UseThree {
    public static void main(String[] args) {
        String hi = String.format("Hi %s, %s, and %s"
                ,args[0], args[1],args[2]);
        System.out.println(hi);
    }
}
