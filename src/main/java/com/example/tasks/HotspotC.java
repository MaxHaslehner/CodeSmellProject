package com.example.tasks;

public class HotspotC {
    public void placeholder() {}

    // GENERATED SMELL 3 - duplicated prints, magic numbers, unused vars
    public void smellyMethod3() {
        int unused = 123; // unused variable
        for (int x = 0; x < 5; x++) {
            if (x % 2 == 0) {
                System.out.println("Magic: " + 42); // magic number
            } else if (x % 3 == 0) {
                System.out.println("Magic: " + 42); // duplicated
            } else {
                System.out.println("Magic: " + 42); // duplicated
            }
        }
        // deep nesting
        boolean a = true;
        if (a) {
            if (!a) {
                if (a) {
                    System.out.println("deep");
                }
            }
        }
    }

    // GENERATED SMELL 6 - duplicated prints, magic numbers, unused vars
    public void smellyMethod6() {
        int unused = 123; // unused variable
        for (int x = 0; x < 5; x++) {
            if (x % 2 == 0) {
                System.out.println("Magic: " + 42); // magic number
            } else if (x % 3 == 0) {
                System.out.println("Magic: " + 42); // duplicated
            } else {
                System.out.println("Magic: " + 42); // duplicated
            }
        }
        // deep nesting
        boolean a = true;
        if (a) {
            if (!a) {
                if (a) {
                    System.out.println("deep");
                }
            }
        }
    }

    // GENERATED SMELL 9 - duplicated prints, magic numbers, unused vars
    public void smellyMethod9() {
        int unused = 123; // unused variable
        for (int x = 0; x < 5; x++) {
            if (x % 2 == 0) {
                System.out.println("Magic: " + 42); // magic number
            } else if (x % 3 == 0) {
                System.out.println("Magic: " + 42); // duplicated
            } else {
                System.out.println("Magic: " + 42); // duplicated
            }
        }
        // deep nesting
        boolean a = true;
        if (a) {
            if (!a) {
                if (a) {
                    System.out.println("deep");
                }
            }
        }
    }
}
