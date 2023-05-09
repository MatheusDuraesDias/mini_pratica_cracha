import jdk.jfr.Event;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        d1.evento(123);
        d1.evento(123);
        d1.evento(123);
        d1.evento(678);


    }

    static Dispositivo d1 = new Dispositivo();
}