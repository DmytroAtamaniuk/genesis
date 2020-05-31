package objects;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {

    public static String getFullName(Locale locale) {
        return new Faker(locale).name().fullName();
    }

    public static String getEmail() {
        return new Faker().internet().emailAddress();
    }


}
