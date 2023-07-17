package dc.gemfire.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rank implements Serializable {

    private static final long serialVersionUID = 444444L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("item")
    private String item;

    @JsonCreator
    public Rank(@JsonProperty("name") String name,
                @JsonProperty("position") Integer position,
                @JsonProperty("item") String item) {
        this.name = name;
        this.position = position;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", item='" + item + '\'' +
                '}';
    }
}
