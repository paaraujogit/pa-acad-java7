package com.filipemcoelho;

import com.filipemcoelho.Admin.Employees.Department;
import com.filipemcoelho.Admin.Employees.Profession;
import com.filipemcoelho.GeneralAPIs.*;
import com.filipemcoelho.GeneralAPIs.Address.Address;
import com.filipemcoelho.GeneralAPIs.Address.City;
import com.filipemcoelho.GeneralAPIs.Address.Country;
import com.filipemcoelho.GeneralAPIs.Address.PostalCode;
import com.filipemcoelho.I18N.Localization;

import java.security.SecureRandom;

class RandomInfo {

    /** Don't allow any instantiation*/
    private RandomInfo(){}

    static PhoneNumber getPhoneNumber(){
        StringBuilder phoneNumber = new StringBuilder();
        for(int i = 1; i <= 9; i++){
            phoneNumber.append(randomNumber(10,0));
        }
        return new PhoneNumber(phoneNumber.toString());
    }

    static Nationality getNationality(){
        StringBuilder nationality = new StringBuilder();
        switch(randomNumber(10, 1)){
            case 1:
                nationality.append(Localization.getString("portuguese"));
                break;
            case 2:
                nationality.append(Localization.getString("american"));
                break;
            case 3:
                nationality.append(Localization.getString("english"));
                break;
            case 4:
                nationality.append(Localization.getString("french"));
                break;
            case 5:
                nationality.append(Localization.getString("angolan"));
                break;
            case 6:
                nationality.append(Localization.getString("south.african"));
                break;
            case 7:
                nationality.append(Localization.getString("swedish"));
                break;
            case 8:
                nationality.append(Localization.getString("chinese"));
                break;
            case 9:
                nationality.append(Localization.getString("japanese"));
                break;
            case 10:
                nationality.append(Localization.getString("brazilian"));
                break;
        }

        return new Nationality(nationality.toString());
    }

    static Language getLanguage(){
        StringBuilder language = new StringBuilder();
        switch(randomNumber(10, 1)){
            case 1:
                language.append(Localization.getString("portuguese"));
                break;
            case 2:
                language.append(Localization.getString("english"));
                break;
            case 3:
                language.append(Localization.getString("spanish"));
                break;
            case 4:
                language.append(Localization.getString("french"));
                break;
            case 5:
                language.append(Localization.getString("arabic"));
                break;
            case 6:
                language.append(Localization.getString("croatian"));
                break;
            case 7:
                language.append(Localization.getString("serbian"));
                break;
            case 8:
                language.append(Localization.getString("malay"));
                break;
            case 9:
                language.append(Localization.getString("greek"));
                break;
            case 10:
                language.append(Localization.getString("czeck"));
                break;
            case 11:
                language.append(Localization.getString("danish"));
                break;
        }

        return new Language(language.toString());
    }

    static SchoolDate getBirthdayChild(){
        return new SchoolDate(randomNumber(28, 1),
                randomNumber(12, 1),
                randomNumber(18, 2000));
    }

    static SchoolDate getBirthdayAdult(){
        return new SchoolDate(randomNumber(28, 1),
                randomNumber(12, 1),
                randomNumber(48, 1950));
    }

    static EmailAddress getEmailAddress(){
        char[] alphabet = new char[26];
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = (char) (97 + i);
        }
        StringBuilder email = new StringBuilder();
        for(int i = 0; i < 10; i++){
            email.append(alphabet[randomNumber(alphabet.length, 0)]);
        }

        switch(randomNumber(5, 1)){
            case 1:
                email.append("@gmail.com"); //NON-NLS
                break;
            case 2:
                email.append("hotmail.com"); //NON-NLS
                break;
            case 3:
                email.append("outlook.com"); //NON-NLS
                break;
            case 4:
                email.append("yahoo.com"); //NON-NLS
                break;
            case 5:
                email.append("icloud.com"); //NON-NLS
                break;
        }

        return new EmailAddress(email.toString());
    }

    static Gender getGender(){
        switch(randomNumber(3, 1)) {
            case 1:
                return Gender.MALE;
            case 2:
                return Gender.FEMALE;
            case 3:
                return Gender.TRANS;
            default:
                return null;
        }
    }

    static FullName getFullName(){
        String middleNames = getFirstName() + " " + getLastNames() + " " + getLastNames();
        return new FullName(getFirstName(), middleNames, getLastNames());
    }

    static Profession getStaffProfession(){
        String profession = "";
        switch(randomNumber(10, 1)){
            case 1:
                profession = Localization.getString("gardener");
                break;
            case 2:
                profession = Localization.getString("security");
                break;
            case 3:
                profession = Localization.getString("cook");
                break;
            case 4:
                profession = Localization.getString("cleaning.lady");
                break;
            case 5:
                profession = Localization.getString("driver");
                break;
            case 6:
                profession = Localization.getString("assistant");
                break;
            case 7:
                profession = Localization.getString("maintenance");
                break;
            case 8:
                profession = Localization.getString("copy.center.assistant");
                break;
            case 9:
                profession = Localization.getString("cook.assistant");
                break;
            case 10:
                profession = Localization.getString("dry.cleaning.lady");
                break;
        }

        return new Profession(profession);
    }

    static Profession getAdminProfession(){
        String profession = "";
        switch(randomNumber(9, 1)){
            case 1:
                profession = Localization.getString("hospitality.manager");
                break;
            case 2:
                profession = Localization.getString("it.manager");
                break;
            case 3:
                profession = Localization.getString("admissions.coordinator");
                break;
            case 4:
                profession = Localization.getString("account.assistant");
                break;
            case 5:
                profession = Localization.getString("account.manager");
                break;
            case 6:
                profession = Localization.getString("director");
                break;
            case 7:
                profession = Localization.getString("ceo");
                break;
            case 8:
                profession = Localization.getString("cto");
                break;
            case 9:
                profession = Localization.getString("trustee");
                break;
        }

        return new Profession(profession);
    }

    private static City getCity(){
        String city;
        switch(randomNumber(16, 1)){
            case 1:
            case 13:
                city = Localization.getString("lisbon");
                break;
            case 2:
            case 14:
                city = Localization.getString("london");
                break;
            case 3:
            case 15:
                city = Localization.getString("rome");
                break;
            case 4:
            case 16:
                city = Localization.getString("venice");
                break;
            case 5:
                city = Localization.getString("paris");
                break;
            case 6:
                city = Localization.getString("new.york");
                break;
            case 7:
                city = Localization.getString("madrid");
                break;
            case 8:
                city = Localization.getString("oporto");
                break;
            case 9:
                city = Localization.getString("luanda");
                break;
            case 10:
                city = Localization.getString("tokyo");
                break;
            case 11:
                city = Localization.getString("los.angeles");
                break;
            case 12:
                city = Localization.getString("faro");
                break;
            default: city = null;
        }
        return City.newCity(city);
    }

    private static Country getCountry(){
        String country;
        switch(randomNumber(16, 1)){
            case 1:
                country = Localization.getString("portugal");
                break;
            case 2:
                country = Localization.getString("england");
                break;
            case 3:
                country = Localization.getString("united.states.of.america");
                break;
            case 4:
                country = Localization.getString("italy");
                break;
            case 5:
                country = Localization.getString("france");
                break;
            case 6:
                country = Localization.getString("angola");
                break;
            case 7:
                country = Localization.getString("brazil");
                break;
            case 8:
                country = Localization.getString("sweden");
                break;
            case 9:
                country = Localization.getString("russia");
                break;
            case 10:
                country = Localization.getString("china");
                break;
            case 11:
                country = Localization.getString("japan");
                break;
            case 12:
                country = Localization.getString("australia");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                country = Localization.getString("portugal");
                break;
            default: country = null;
        }
        return Country.newCountry(country);
    }

    private static PostalCode getPostalCode(){
        String primary = Integer.toString(randomNumber(7500, 2000));
        String secondary = Integer.toString(randomNumber(999, 0));
        return new PostalCode(primary, secondary);
    }

    @SuppressWarnings("HardCodedStringLiteral")
    public static Address getAddress(){
        return new Address("Rua Teste xxx", "nº X", "4º D", getPostalCode(), getCity(), getCountry());
    }

    @SuppressWarnings("HardCodedStringLiteral")
    static Department getDepartment(){
        String department = "";
        switch(randomNumber(5, 1)){
            case 1:
                department = "Maintenance";
                break;
            case 2:
                department = "Drivers";
                break;
            case 3:
                department = "Kitchen";
                break;
            case 4:
                department = "Cleaning";
                break;
            case 5:
                department = "Security & Protection";
                break;
        }

        return new Department(department);
    }

    @SuppressWarnings("HardCodedStringLiteral")
    private static String getFirstName(){
        switch(randomNumber(20, 1)){
            case 1:
                return "Filipe";
            case 2:
                return "Sofia";
            case 3:
                return "Vitor";
            case 4:
                return "Isabel";
            case 5:
                return "Inês";
            case 6:
                return "Matilde";
            case 7:
                return "Koen";
            case 8:
                return "Henrique";
            case 9:
                return "Júlia";
            case 10:
                return "Ana";
            case 11:
                return "Nuno";
            case 12:
                return "Sandra";
            case 13:
                return "Pedro";
            case 14:
                return "Teresa";
            case 15:
                return "Alice";
            case 16:
                return "Sandra";
            case 17:
                return "Maria";
            case 18:
                return "Rita";
            case 19:
                return "Luís";
            case 20:
                return "Margarida";
            default:
                return "";
        }
    }

    @SuppressWarnings("HardCodedStringLiteral")
    private static String getLastNames(){
        switch(randomNumber(20, 1)){
            case 1:
                return "Coelho";
            case 2:
                return "Soares";
            case 3:
                return "Serrano";
            case 4:
                return "Rebelo";
            case 5:
                return "Bicego";
            case 6:
                return "Abreu";
            case 7:
                return "Albuquerque";
            case 8:
                return "Alves";
            case 9:
                return "Leitão";
            case 10:
                return "Neves";
            case 11:
                return "Cavalinhos";
            case 12:
                return "Neves";
            case 13:
                return "Vieira";
            case 14:
                return "Bastos";
            case 15:
                return "Barreto";
            case 16:
                return "Viegas";
            case 17:
                return "Lopes";
            case 18:
                return "Jantaradas";
            case 19:
                return "Belmonte";
            case 20:
                return "Beltrão";
            default:
                return "";
        }
    }

    private static int randomNumber(int bound, int shift){
        SecureRandom myRandom = new SecureRandom();
        return myRandom.nextInt(bound) + shift;
    }
}
