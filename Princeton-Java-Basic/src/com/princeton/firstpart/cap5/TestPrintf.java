package com.princeton.firstpart.cap5;

import java.util.Calendar;

public class TestPrintf {
    public static void main(String[] args) {
        String e = String.format("%9.7f", Math.PI)
                .replace(',','.');
        String f = (e.contains("1")) ? e.replace('1','2') : e;

        System.out.printf("%s",f);
        System.out.printf("\nHorário local:%tT", Calendar.getInstance());
    }
}
