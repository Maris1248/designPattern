package org.maris.factories;

import org.maris.elements.Button;
import org.maris.elements.CheckBox;
import org.maris.elements.MacButton;
import org.maris.elements.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
