package com.filipemcoelho.I18N;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Localization is a final and  no instance class that can-t be instantiated.
 * It provides the basic settings for localization and translation of the SchoolManager application.
 *
 * The {@link com.filipemcoelho.Main} has a method {@code setLocale} that calls the {@code String[] args}
 * from psvm method, which it's arguments provide the language and country to set .
 *
 * Based on {@code Locale} the {@code ResourceBundle} is set to fetch the appropriate translated
 * {@code .properties} file.
 *
 * @see java.util.Locale
 * @see java.util.ResourceBundle
 */
public final class Localization {

    /** Value that define {@code Locale} */
    private static Locale locale;
    /** Value that define {@code ResourseBundle} */
    private static ResourceBundle label;

    /** Private constructor that doesn't allow any instantiation */
    private Localization(){}

    /**
     * Method sets both Fields {@code Locale} and {@code ResourceBundle}
     *
     * @param language language that comes from the {@code String[]} args arguments
     * @param country country that comes from the {@code String[]} args arguments
     */
    @SuppressWarnings("HardCodedStringLiteral")
    public static void setLocale(String language, String country){
        if(language.equals("en") && country.equals("US")){
            locale = new Locale("en", "US");
            label = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N_en_US", locale);
        }
        if(language.equals("en") && country.equals("UK")){
            locale = new Locale("en", "UK");
            label = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N_en_UK", locale);
        }
        if(language.equals("pt") && country.equals("PT")){
            locale = new Locale("pt", "PT");
            label = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N_pt_PT", locale);
        }
        if(language.equals("pt") && country.equals("BR")){
            locale = new Locale("pt", "BR");
            label = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N_pt_BR", locale);
        }
        if(language.equals("fr") && country.equals("FR")){
            locale = new Locale("fr", "FR");
            label = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N_fr_FR", locale);
        }
        if(language.equals("it") && country.equals("IT")){
            locale = new Locale("it", "IT");
            label = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N_it_IT", locale);
        }
    }

    /**
     * Method that sort of overrides the {@code getString} method from the {@code }ResourceBundle} and fetches
     * the correct "translated" String from the properties file.
     *
     * @param string String to be translated
     * @return translated String (from the {@code }ResourceBundle} proprieties file)
     */
    public static String getString(String string){
        return label.getString(string);
    }

    /*
    public static Locale localeDefault = Locale.getDefault();
    public static ResourceBundle labelDef = ResourceBundle.getBundle("com/filipemcoelho/I18N/localizationI18N", localeDefault);

    public static void getDefault() {
        System.out.println(localeDefault.getDisplayCountry());
        System.out.println(localeDefault.getDisplayLanguage());
        System.out.println(localeDefault.getDisplayName());
        System.out.println(localeDefault.getISO3Country());
        System.out.println(localeDefault.getISO3Language());
        System.out.println(localeDefault.getLanguage());
        System.out.println(localeDefault.getCountry());
    }*/
}
