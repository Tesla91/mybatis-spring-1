package mybatis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nicola on 7/25/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BeerHomework {
    String beer_name;
    String brewery;
    String brewery_city;
    String brewery_state;

    public String getBeer_name() {
        return beer_name;
    }

    public void setBeer_name(String beer_name) {
        this.beer_name = beer_name;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getBrewery_city() {
        return brewery_city;
    }

    public void setBrewery_city(String brewery_city) {
        this.brewery_city = brewery_city;
    }

    public String getBrewery_state() {
        return brewery_state;
    }

    public void setBrewery_state(String brewery_state) {
        this.brewery_state = brewery_state;
    }
}
