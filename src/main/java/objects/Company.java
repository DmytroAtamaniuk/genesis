package objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
                           "type",
                           "id_company",
                           "company"
                   })
public class Company extends CreateCompany {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id_company")
    private Integer idCompany;
    @JsonProperty("company")
    private Company company;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id_company")
    public Integer getIdCompany() {
        return idCompany;
    }

    @JsonProperty("id_company")
    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

}