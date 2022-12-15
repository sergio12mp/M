package Modelado.P4.EJ3;

import java.util.List;

public class Mailbox {
    private List<Email> email;
    private BeforeStrategy estrategia;

    public Mailbox() {
    }

    public void show() {
        System.out.println(email.toString());
    }

    private void sort() {
        for (int i = 2; i <= email.size(); i++) {
            for (int j = email.size(); j >= i; j--) {
                if (estrategia.before(email.get(j), email.get(j - 1))) {
                }
            }
        }
    }
}