package mybatis.services;


import mybatis.mappers.RefugeeMapper;
import mybatis.model.Refugee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


/**
 * Created by nicola on 7/24/17.
 */
@Service
public class RefugeeService {

    @Autowired
    RefugeeMapper refugeeMapper;

    public ArrayList<Refugee> getAsylum_country(String asylum_country){
        return refugeeMapper.getAsylum_country(asylum_country);
    }

    public ArrayList<Refugee> getOrigin_country(String origin_country){
        return refugeeMapper.getOrigin_country(origin_country);
    }

    public ArrayList<Refugee> getYr(int yr){
        return refugeeMapper.getYr(yr);
    }

    public Refugee getAllRefugees(String asylum_country){
        return refugeeMapper.getAll_refugees(asylum_country);
    }

}
