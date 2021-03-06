package mybatis.controllers.User;

import java.util.ArrayList;

import mybatis.model.User.User;
import mybatis.services.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public ArrayList<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/{id}")
    public User getById(@PathVariable(value="id")int id) {
        return userService.getById(id);
    }

    @RequestMapping("/manual")
    public ArrayList<User> getUsersManually() {
        // write the necessary code to get all users and return
        // them in json to the browser without using mybatis
        return userService.getAllUsersManually();
    }

    //Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public User addNew(@RequestBody User user) {
        return userService.addNew(user);
    }

    //Update
    @RequestMapping(method = RequestMethod.PUT, value = "/")
    public User updateById(@RequestBody User user) {
        return userService.updateById(user);
    }

    //Delete
    @RequestMapping(method= RequestMethod.DELETE, value = "/")
    public int deleteById(@PathVariable(value = "id")int id){
        return userService.deleteById(id);
    }

}

