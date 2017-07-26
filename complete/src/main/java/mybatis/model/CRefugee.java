package mybatis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nicola on 7/25/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CRefugee {
    String country;
    int start_year;
    int end_year;
    double total_refugees;

    public CRefugee() {
    }

    public CRefugee(String country, int start_year, int end_year, double total_refugees) {
        this.country = country;
        this.start_year = start_year;
        this.end_year = end_year;
        this.total_refugees = total_refugees;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStart_year() {
        return start_year;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public int getEnd_year() {
        return end_year;
    }

    public void setEnd_year(int end_year) {
        this.end_year = end_year;
    }

    public double getTotal_refugees() {
        return total_refugees;
    }

    public void setTotal_refugees(double total_refugees) {
        this.total_refugees = total_refugees;
    }
}
