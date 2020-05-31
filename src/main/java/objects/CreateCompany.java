package objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
                           "name",
                           "type",
                           "inn",
                           "ogrn",
                           "kpp",
                           "phone",
                           "adress",
                           "users"
                   })
public class CreateCompany {

    @JsonProperty("name")
    private String getName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("inn")
    private String inn;
    @JsonProperty("ogrn")
    private String ogrn;
    @JsonProperty("kpp")
    private String kpp;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("adress")
    private String adress;
    @JsonProperty("users")
    private List<String> users = null;

    @JsonProperty("name")
    public String getName() {
        return getName;
    }

    @JsonProperty("name")
    public void setName(String getName) {
        this.getName = getName;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("inn")
    public String getInn() {
        return inn;
    }

    @JsonProperty("inn")
    public void setInn(String inn) {
        this.inn = inn;
    }

    @JsonProperty("ogrn")
    public String getOgrn() {
        return ogrn;
    }

    @JsonProperty("ogrn")
    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @JsonProperty("kpp")
    public String getKpp() {
        return kpp;
    }

    @JsonProperty("kpp")
    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("adress")
    public String getAdress() {
        return adress;
    }

    @JsonProperty("adress")
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

}