package mybatis.model;

/**
 * Created by nicola on 7/25/17.
 */
public class Image {

    String icon;  //: https://s3.amazonaws.com/brewerydbapi/brewery/nvfMg1/upload_mcniin-icon.png,
    String medium;  //: https://s3.amazonaws.com/brewerydbapi/brewery/nvfMg1/upload_mcniin-medium.png,
    String large;  //: https://s3.amazonaws.com/brewerydbapi/brewery/nvfMg1/upload_mcniin-large.png,
    String squareMedium;  //: https://s3.amazonaws.com/brewerydbapi/brewery/nvfMg1/upload_mcniin-squareMedium.png,
    String squareLarge;  //: https://s3.amazonaws.com/brewerydbapi/brewery/nvfMg1/upload_mcniin-squareLarge.png

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getSquareMedium() {
        return squareMedium;
    }

    public void setSquareMedium(String squareMedium) {
        this.squareMedium = squareMedium;
    }

    public String getSquareLarge() {
        return squareLarge;
    }

    public void setSquareLarge(String squareLarge) {
        this.squareLarge = squareLarge;
    }
}
