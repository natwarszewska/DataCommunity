package dc.gemfire.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sale implements Serializable {

    private static final long serialVersionUID = 555555L;


    @JsonProperty("saleName")
    private String saleName;

    @JsonProperty("discountValue")
    private Integer discountValue;

    @JsonProperty("startDate")
    private String startDate;

    @JsonProperty("endDate")
    private String endDate;

    @JsonCreator
    public Sale(@JsonProperty("saleName") String saleName,
                @JsonProperty("discountValue") Integer discountValue,
                @JsonProperty("startDate") String startDate,
                @JsonProperty("endDate") String endDate) {
        this.saleName = saleName;
        this.discountValue = discountValue;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public Integer getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleName='" + saleName + '\'' +
                ", discountValue=" + discountValue +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
