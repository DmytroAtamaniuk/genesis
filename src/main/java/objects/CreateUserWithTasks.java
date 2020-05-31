package objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import objects.Task;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
                           "name",
                           "email",
                           "tasks"
                   })
public class CreateUserWithTasks {

    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("tasks")
    private List<Task> tasks = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
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