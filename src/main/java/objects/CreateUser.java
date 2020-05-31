package objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
                           "email",
                           "name",
                           "companies",
                           "tasks"
                   })
public class CreateUser {

    @JsonProperty("email")
    private String email;
    @JsonProperty("name")
    private String name;
    @JsonProperty("companies")
    private List<Company> companies = null;
    @JsonProperty("tasks")
    private List<Task> tasks = null;

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("companies")
    public List<Company> getCompanies() {
        return companies;
    }

    @JsonProperty("companies")
    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @JsonProperty("tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    @JsonProperty("tasks")
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}