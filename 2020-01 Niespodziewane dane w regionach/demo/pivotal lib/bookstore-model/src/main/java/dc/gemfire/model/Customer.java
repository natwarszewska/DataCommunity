package dc.gemfire.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {

    private static final long serialVersionUID = 222222L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("customerId")
    private String customerId;

    @JsonProperty("activeSince")
    private String activeSince;

    @JsonCreator
    public Customer(@JsonProperty("name") String name,
                    @JsonProperty("surname") String surname,
                    @JsonProperty("customerId") String customerId,
                    @JsonProperty("activeSince") String activeSince) {
        this.name = name;
        this.surname = surname;
        this.customerId = customerId;
        this.activeSince = activeSince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(String activeSince) {
        this.activeSince = activeSince;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", customerId='" + customerId + '\'' +
                ", activeSince='" + activeSince + '\'' +
                '}';
    }
}
