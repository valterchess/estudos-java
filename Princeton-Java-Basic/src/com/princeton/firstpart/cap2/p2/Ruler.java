package com.princeton.firstpart.cap2.p2;

public class Ruler {
    public static void main(String[] args) {
        String ruler1 = " 1 ";
        String ruler2 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler4 = ruler3 + "4" + ruler3;
        String ruler5 = ruler4 + "5" + ruler4;
        var rulers = String.format("%s\n%s\n%s\n%s\n%s"
                ,ruler1,ruler2,ruler3,ruler4,ruler5);
        System.out.println(rulers);
    }
}
