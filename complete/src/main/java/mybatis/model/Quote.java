package mybatis.model;

/**
 * Created by nicola on 7/25/17.
 */
public class Quote {

    private String type;
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
