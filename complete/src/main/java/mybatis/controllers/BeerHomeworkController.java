package mybatis.controllers;

import mybatis.model.BeerHomework;
import mybatis.services.BeerHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nicola on 7/25/17.
 */
@RestController
public class BeerHomeworkController {

    @Autowired
    BeerHomeworkService beerHomeworkService;

    @RequestMapping("/beer/homework")
    public BeerHomework beerHomework() {
        BeerHomework beerHomework1 = beerHomeworkService.beerTime();
        return beerHomework1;

    }

}
