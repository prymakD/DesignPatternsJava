package com.patterns;


import com.patterns.factory.DemoFactoryPattern;
import com.patterns.factory.DialogFactory;
import com.patterns.factory.HtmlDialogFactory;
import com.patterns.factory.WindowsDialogFactory;

/**
 * 1. Factory pattern
 *
 */
public class Main {

    public static void main(String[] args) {
        // Factory pattern
        DemoFactoryPattern factoryPattern = new DemoFactoryPattern();
        factoryPattern.configure();
        factoryPattern.runBusinessLogic();
    }


}
