package com.patterns.factory;

import com.patterns.factory.buttons.Button;
import com.patterns.factory.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialogFactory extends DialogFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
