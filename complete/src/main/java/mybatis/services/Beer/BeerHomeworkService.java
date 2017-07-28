package mybatis.services.Beer;

import mybatis.model.Beer.Beer;
import mybatis.model.Beer.BeerHomework;
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

        BeerHomework beerHomework = new BeerHomework();
        beerHomework.setBeer_name(beerWithBrewery.getData().getName());
        beerHomework.setBrewery(beerWithBrewery.getData().getBreweries()[0].getName());
        beerHomework.setBrewery_city(beerWithBrewery.getData().getBreweries()[0].getLocations()[0].getLocality());
        beerHomework.setBrewery_state(beerWithBrewery.getData().getBreweries()[0].getLocations()[0].getRegion());

        return beerHomework;
    }

}
