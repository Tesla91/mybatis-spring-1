package mybatis.services;

import mybatis.model.Beer;
import mybatis.model.BeerHomework;
import mybatis.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nicola on 7/25/17.
 */
@Service
public class BeerHomeworkService {

    @Autowired
    RestTemplate restTemplate;

    public BeerHomework beerTime(){
        Beer beer = restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/random?key=869a96bff7acf73678c6bff02f7876f2", Beer.class);

        String id = beer.getData().getId();
        Beer beerWithBrewery = restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/"+ id +"?withBreweries=Y&key=869a96bff7acf73678c6bff02f7876f2", Beer.class);

        String beer_name = beerWithBrewery.getData().getName();
        String beer_brewery = beerWithBrewery.getData().getBreweries()[0].getName();
        String brewery_city = beerWithBrewery.getData().getBreweries()[0].getLocations()[0].getLocality();
        String brewery_state = beerWithBrewery.getData().getBreweries()[0].getLocations()[0].getRegion();

        BeerHomework beerHomework = new BeerHomework();
        beerHomework.setBeer_name(beer_name);
        beerHomework.setBrewery(beer_brewery);
        beerHomework.setBrewery_city(brewery_city);
        beerHomework.setBrewery_state(brewery_state);

        return beerHomework;
    }



}
