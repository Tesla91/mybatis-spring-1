package mybatis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nicola on 7/24/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Refugee {
    String asylum_country;
    String origin_country;
    int yr;
    double refugees;
    double total_population;
    double all_refugees;

    public Refugee() {
    }

    public String getAsylum_country() {
        return asylum_country;
    }

    public void setAsylum_country(String asylum_country) {
        this.asylum_country = asylum_country;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public int getYr() {
        return yr;
    }

    public void setYr(int yr) {
        this.yr = yr;
    }

    public double getRefugees() {
        return refugees;
    }

    public void setRefugees(double refugees) {
        this.refugees = refugees;
    }

    public double getTotal_population() {
        return total_population;
    }

    public void setTotal_population(double total_population) {
        this.total_population = total_population;
    }

    public double getAll_refugees() {
        return all_refugees;
    }

    public void setAll_refugees(double all_refugees) {
        this.all_refugees = all_refugees;
    }
}
