package mybatis.mappers;

import mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * Created by nicola on 7/24/17.
 */
@Mapper
public interface UserMapper {

    String GET_ALL_ACTIVE_USERS = "SELECT * FROM `mybatis-test`.Users where isActive = 1";
    String GET_BY_ID = "SELECT * FROM `mybatis-test`.Users where id = #{id}";
    String INSERT_USER = "INSERT INTO `mybatis-test`.Users (first_name, last_name, email) VALUES (#{first_name}, " +
            "#{last_name}, #{email} )";
    String UPDATE_USER = "UPDATE `mybatis-test`.Users set first_name = #{first_name}, last_name = #{last_name}," +
            "email = #{email} WHERE id = #{id}";
    String DELETE_USER = "UPDATE `mybatis-test`.Users set isActive = 0 WHERE id = #{id}";
    String GET_EMAIL = "SELECT * FROM `mybatis-test`.Users where email = #{email}";


    @Select(GET_ALL_ACTIVE_USERS)
    public ArrayList<User> getAllUsers();

    @Select(GET_BY_ID)
    public User getById(int id);

    @Insert(INSERT_USER)
    public int insertUser(User user);

    @Update(UPDATE_USER)
    public int updateUser(User user);

    @Update(DELETE_USER)
    public int deleteUser(int id);

    @Select(GET_EMAIL)
    public User getByEmail(String email);

}
