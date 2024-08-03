package org.maris;

import org.maris.application.Application;
import org.maris.factories.GUIFactory;
import org.maris.factories.MacFactory;
import org.maris.factories.WinFactory;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            throw new RuntimeException("Missing argument");
        }

        String os = args[0];
        GUIFactory factory = null;

        if (os.equals("Windows")) {
            factory = new WinFactory();
        } else if (os.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Unknown operating System");
        }

        Application application = new Application(factory);

        application.paint();

    }
}