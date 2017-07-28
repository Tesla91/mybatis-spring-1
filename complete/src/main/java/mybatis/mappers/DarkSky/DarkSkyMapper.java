package mybatis.mappers.DarkSky;

import mybatis.model.DarkSky.DailyForecast;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

/**
 * Created by nicola on 7/27/17.
 */
@Mapper
public interface DarkSkyMapper {

    String GET_DAILY_FORECAST = "SELECT * FROM `dark_sky`.weather_forecast ORDER BY date desc LIMIT 8"  ;
    String INSERT_DAILY_FORECAST = "INSERT INTO `dark_sky`.weather_forecast (latitude, " +
            "longitude, timezone, date, summary, sunrise, sunset, precipProbability, temperatureMax, windSpeed) " +
            "VALUES (#{latitude}, #{longitude}, #{timezone}, #{date}, #{summary}, #{sunrise}, #{sunset}, " +
            "#{precipProbability}, #{temperatureMax}, #{windSpeed})"  ;
    String GET_MOST_RECENT_DATE = "SELECT date FROM `dark_sky`.weather_forecast ORDER BY date desc LIMIT 1";

    @Insert(INSERT_DAILY_FORECAST)
    public int insertWeatherDailyForecast(DailyForecast dailyForecast);
    @Select(GET_DAILY_FORECAST)
    public ArrayList<DailyForecast> getDailyForecast();
    @Select(GET_MOST_RECENT_DATE)
    public String getMostRecentDate();
}
