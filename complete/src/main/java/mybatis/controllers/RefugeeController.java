package mybatis.controllers;

import mybatis.model.Refugee;
import mybatis.model.User;
import mybatis.services.RefugeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/refugees_all")
public class RefugeeController {

    @Autowired
    RefugeeService refugeeService;

    @RequestMapping(value = "/asylum_country/{asylum_country}", method = RequestMethod.GET)
    public ArrayList<Refugee> getAsylum_country(@PathVariable String asylum_country) {
        return refugeeService.getAsylum_country(asylum_country);
    }

    @RequestMapping(value = "/origin_country/{origin_country}", method = RequestMethod.GET)
    public ArrayList<Refugee> getOrigin_country(@PathVariable String origin_country) {
        return refugeeService.getOrigin_country(origin_country);
    }

    @RequestMapping(value = "/yr/{yr}", method = RequestMethod.GET)
    public ArrayList<Refugee> getYr(@PathVariable int yr) {
        return refugeeService.getYr(yr);
    }

}
