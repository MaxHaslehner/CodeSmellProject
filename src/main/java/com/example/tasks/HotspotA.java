package com.example.tasks;

public class HotspotA {
    public void placeholder() {}

    // GENERATED SMELL 1 - duplicated prints, magic numbers, unused vars
    public void smellyMethod1() {
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

    // GENERATED SMELL 4 - duplicated prints, magic numbers, unused vars
    public void smellyMethod4() {
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

    // GENERATED SMELL 7 - duplicated prints, magic numbers, unused vars
    public void smellyMethod7() {
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

    // GENERATED SMELL 10 - duplicated prints, magic numbers, unused vars
    public void smellyMethod10() {
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

    // GENERATED SMELL 13 - duplicated prints, magic numbers, unused vars
    public void smellyMethod13() {
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
