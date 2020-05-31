import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.Company;
import objects.Config;
import objects.CreateUser;
import objects.CreateUserWithTasks;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class MainTests extends Config {
    ObjectMapper objectMapper;
    Config config;

    private final static String BASE_URL = "http://users.bugred.ru/tasks/rest/";
    private final static String SUCCESS = "success";

    @BeforeMethod
    public void beforeMethod(){
        objectMapper = new ObjectMapper();
        config = new Config();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    @Test(dataProvider = "companyData")
    public void createCompany(String companyName, String companyType, String users, String emailOwner) throws IOException {
        String json =

                    "{\"company_name\":\"" + companyName + "\"," +
                    "\"company_type\":\"" + companyType + "\"," +
                    "\"company_users\":[\"" + users + "\"]," +
                    "\"email_owner\":\"" + emailOwner + "\"}";

        String response = config.post(BASE_URL + "/createcompany", json);
        Company company = objectMapper.readValue(response, Company.class);
        System.out.println(response);

        assertEquals(company.getCompany().getName(), companyName);
        assertEquals(company.getCompany().getType(), companyType);
        assertTrue(company.getCompany().getUsers().contains(users));
        assertEquals(company.getType(), SUCCESS);
    }

    @Test(dataProvider = "usersData")
    public void createUserWithoutTasks(String userEmail, String userName) throws IOException {
        String json = "{\"email\":\"" + userEmail + "\",\"name\":\"" + userName + "\",\"tasks\":[16612],\"companies\":[17564]}";

        String response = config.post(BASE_URL + "/createuser", json);
        CreateUser users = objectMapper.readValue(response, CreateUser.class);
        System.out.println(response);

        assertEquals(users.getName(), userName);
        assertEquals(users.getEmail(), userEmail);
        assertNotNull(users.getCompanies());
        assertNotNull(users.getTasks());

    }

    @Test(dataProvider = "usersData")
    public void createUserWithTasks(String userEmail, String userName) throws IOException {
        String json =

                    "{\"email\":\"" + userEmail + "\"," +
                    "\"name\":\"" + userName + "\"," +
                    "\"tasks\":[{\"title\":\"Buy yogurt\",\"description\":\"300g, strawberry\"}]}";

        String response = config.post(BASE_URL + "/createuserwithtasks", json);
        CreateUserWithTasks tasks = objectMapper.readValue(response, CreateUserWithTasks.class);
        System.out.println(response);

        assertEquals(tasks.getName(), userName);
        assertEquals(tasks.getEmail(), userEmail);
        assertNotNull(tasks.getTasks());



    }
}
