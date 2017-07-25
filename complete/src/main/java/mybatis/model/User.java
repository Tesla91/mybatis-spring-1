package mybatis.model;

/**
 * Created by nicola on 7/24/17.
 */
public class User {
    int id;
    String first_name;
    String last_name;
    int isActive;
    String email;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        isActive = isActive;
    }
}
