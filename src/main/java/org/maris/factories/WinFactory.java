package org.maris.factories;

import org.maris.elements.Button;
import org.maris.elements.CheckBox;
import org.maris.elements.WinButton;
import org.maris.elements.WinCheckBox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
