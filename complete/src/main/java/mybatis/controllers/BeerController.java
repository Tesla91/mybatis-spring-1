package mybatis.controllers;

import mybatis.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nicola on 7/25/17.
 */
@RestController
public class BeerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/beer/random")
    public Beer getRandomBeer() {
        return restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/random?key=869a96bff7acf73678c6bff02f7876f2", Beer.class);
    }
}
