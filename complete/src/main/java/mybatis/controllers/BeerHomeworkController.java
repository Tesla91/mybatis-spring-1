package mybatis.controllers;

import mybatis.model.Beer;
import mybatis.model.BeerHomework;
import mybatis.model.Data;
import mybatis.services.BeerHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Created by nicola on 7/25/17.
 */
@RestController
public class BeerHomeworkController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    BeerHomeworkService beerHomeworkService;

    @RequestMapping("/beer/homework")
    public BeerHomework beerHomework() {
        BeerHomework beerHomework1 = beerHomeworkService.beerTime();
        return beerHomework1;

    }

}
