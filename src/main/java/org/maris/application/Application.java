package org.maris.application;

import org.maris.elements.Button;
import org.maris.elements.CheckBox;
import org.maris.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
        createButton();
        createCheckBox();
    }

    void createButton () {
        this.button = this.factory.createButton();
    }

    void createCheckBox () {
        this.checkBox = this.factory.createCheckBox();
    };

     public void paint() {
        this.button.paint();
        this.checkBox.paint();
    }
}
