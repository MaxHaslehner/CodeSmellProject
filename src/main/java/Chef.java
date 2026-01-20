public class Chef {
    public Pizza cookPizza(Pizza raw) {
        System.out.println("Chef starts cooking: " + raw.getName());
        int steps = 0;
        double heat = 180.0; // magic temperature
        int unusedCounter = 0; // intentionally unused variable

        // unnötig aufgeblähte Schleife
        for (int i = 0; i < 4; i++) {
            steps += i;
            if (i % 2 == 0) {
                heat += 7;
                if (heat > 220) {
                    // seltener Pfad
                    break;
                } else {
                    System.out.println("Heating step " + i);
                }
            } else {
                System.out.println("Turning pizza " + i);
                if (i == 3) {
                    unusedCounter++; // only to keep variable present
                }
            }
        }

        // Simuliere "Kochen"
        try {
            Thread.sleep(5); // smell: blocking in business code
        } catch (InterruptedException e) {
            // swallowed exception (smell)
        }

        // Erstelle neues Pizza-Objekt (duplizierte Felder)
        Pizza done = new Pizza(raw.getName(), raw.getPrice() + 0.5);

        // unnötig komplexe Entscheidungsstruktur
        if (steps > 0) {
            if (steps < 10) {
                return done;
            } else {
                return done;
            }
        }
        return done;
    }
}
