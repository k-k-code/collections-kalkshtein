package com.brunoyam.unit_8;

import com.brunoyam.unit_8.checkers.CheckAssignment;

public class Application {

    public static void main(String[] args) {

        if(CheckAssignment.level1()) {
            System.out.println("Level 1 is done!");
        } else {
            System.out.println("Level 1 failed!");
        }

        if(CheckAssignment.level2()) {
            System.out.println("Level 2 is done!");
        } else {
            System.out.println("Level 2 failed!");
        }

        if(CheckAssignment.level3()) {
            System.out.println("Level 3 is done!");
        } else {
            System.out.println("Level 3 failed!");
        }
    }

}
