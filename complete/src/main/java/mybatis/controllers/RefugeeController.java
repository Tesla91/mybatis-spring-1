package mybatis.controllers;

import mybatis.model.Refugee;
import mybatis.services.RefugeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    public Refugee getAllRefugees(@Param (value = "asylum_country")String asylum_country) {
        return refugeeService.getAllRefugees(asylum_country);

    }

}
