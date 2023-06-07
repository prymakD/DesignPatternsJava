package com.patterns.factory;

public class DemoFactoryPattern {

    private DialogFactory dialog;

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    public void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialogFactory();
        } else {
            dialog = new HtmlDialogFactory();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    public void runBusinessLogic() {
        dialog.renderWindow();
    }
}
