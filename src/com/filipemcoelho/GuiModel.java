package com.filipemcoelho;

public class GuiModel {

    /**
     * Singleton Instantiation
     *
     * {@code Inner static helper class} to instantiate the only possible
     * instantiation of the {@code GUiModel} class.
     *
     * Protecting this way, prevents the class being loaded into the memory,
     * and only when someone calls the {@code getInstance} method, the class gets loaded
     * and creates the single class instance. This method is called the
     * "Bill Pugh Singleton Implementation"
     */
    private static class SingletonClass{
        private static final GuiModel INSTANCE = new GuiModel();
    }

    /**
     * Singleton Instantiation
     *
     * Calls the inner class {@code SingletonClass}
     *
     * @return the singleton Instance.
     */
    public static GuiModel getInstance(){
        return GuiModel.SingletonClass.INSTANCE;
    }
}
