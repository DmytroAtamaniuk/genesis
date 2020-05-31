package objects;

import org.testng.annotations.DataProvider;

import static java.util.Locale.ENGLISH;
import static objects.DataGenerator.getEmail;
import static objects.DataGenerator.getFullName;

public class Data {

    @DataProvider
    public Object[][] companyData() {
        Object[][] data = new Object[3][4];

        data[0][0] = "Apple";
        data[0][1] = "ООО";
        data[0][2] = "user1@gmail.com";
        data[0][3] = "test@gmail.com";

        data[1][0] = "Microsoft";
        data[1][1] = "ИП";
        data[1][2] = "user@gmail.com";
        data[1][3] = "test2@gmail.com";

        data[2][0] = "Tesla";
        data[2][1] = "ОАО";
        data[2][2] = "user@gmail.com";
        data[2][3] = "test3@gmail.com";

        return data;
    }

    @DataProvider
    public Object[][] usersData() {
        Object[][] data = new Object[3][2];

        data[0][0] = getEmail();
        data[0][1] = getFullName(ENGLISH);

        data[1][0] = getEmail();
        data[1][1] = getFullName(ENGLISH);

        data[2][0] = getEmail();
        data[2][1] = getFullName(ENGLISH);

        return data;
    }


}
