package com.filipemcoelho;

public class DataBaseModel {

    /**
     * Singleton Instantiation
     *
     * {@code Inner static helper class} to instantiate the only possible
     * instantiation of the {@code DataBaseModel} class.
     *
     * Protecting this way, prevents the class being loaded into the memory,
     * and only when someone calls the {@code getInstance} method, the class gets loaded
     * and creates the single class instance. This method is called the
     * "Bill Pugh Singleton Implementation"
     */
    private static class SingletonClass{
        private static final DataBaseModel INSTANCE = new DataBaseModel();
    }

    /**
     * Singleton Instantiation
     *
     * Calls the inner class {@code SingletonClass}
     *
     * @return the singleton Instance.
     */
    public static DataBaseModel getInstance(){
        return DataBaseModel.SingletonClass.INSTANCE;
    }
}
