package com.patterns.factory;

import com.patterns.factory.buttons.Button;
import com.patterns.factory.buttons.WindowsButton;

import java.awt.*;


/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialogFactory extends DialogFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
