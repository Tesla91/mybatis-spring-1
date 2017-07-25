package mybatis.model;

/**
 * Created by nicola on 7/24/17.
 */
public class Refugee {
    String asylum_country;
    String origin_country;
    int yr;

    public Refugee() {
    }

    public Refugee(String asylum_country, String origin_country, int yr) {
        this.asylum_country = asylum_country;
        this.origin_country = origin_country;
        this.yr = yr;
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
}
