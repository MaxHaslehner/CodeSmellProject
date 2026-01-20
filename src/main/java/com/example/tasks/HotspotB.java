package com.example.tasks;

public class HotspotB {
    public void placeholder() {}

    // GENERATED SMELL 2 - duplicated prints, magic numbers, unused vars
    public void smellyMethod2() {
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
