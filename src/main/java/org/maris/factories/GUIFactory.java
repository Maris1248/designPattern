package org.maris.factories;

import org.maris.elements.Button;
import org.maris.elements.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
