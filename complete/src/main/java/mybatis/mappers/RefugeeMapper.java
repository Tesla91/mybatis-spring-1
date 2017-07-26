package mybatis.mappers;

import mybatis.model.Refugee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by nicola on 7/24/17.
 */
@Mapper
public interface RefugeeMapper {

    String GET_ASYLUM_COUNTRY = "SELECT * FROM `immigrants`.refugees_all where asylum_country = #{asylum_country}";
    String GET_ORIGIN_COUNTRY = "SELECT * FROM `immigrants`.refugees_all where origin_country = #{origin_country}";
    String GET_YEAR = "SELECT * FROM `immigrants`.refugees_all where yr = #{yr}";
    String GET_ALL_REFUGEES = "SELECT SUM(refugees) as all_refugees, asylum_country FROM `immigrants`." +
            "refugees_all where asylum_country = #{asylum_country}";


    @Select(GET_ASYLUM_COUNTRY)
    public ArrayList<Refugee> getAsylum_country(String asylum_country);

    @Select(GET_ORIGIN_COUNTRY)
    public ArrayList<Refugee> getOrigin_country(String origin_country);

    @Select(GET_YEAR)
    public ArrayList<Refugee> getYr(int yr);

    @Select(GET_ALL_REFUGEES)
    public Refugee getAll_refugees(String asylum_country);

}
