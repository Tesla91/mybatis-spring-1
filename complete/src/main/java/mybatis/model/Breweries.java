package mybatis.model;

/**
 * Created by nicola on 7/25/17.
 */
public class Breweries {

    String id;  //
    String name;  //: "Cambridge Brewing Company",
    String nameShortDisplay;  //: "Cambridge",
    String description;  //: "CBC blends a passion for fresh, flavorful beer and delicious, imaginative cuisine to create a one-of-a-kind dining experience for greater Boston. Since opening in 1989, CBC has been the destination for diners with adventurous palates and a thirst for both authentic flavors and unique interpretations of classic beer styles. To satisfy these appetites, CBC’s brewmaster and chef routinely collaborate on investigating beer-food pairings and ways in which beer—even brewing ingredients—can transform traditional dishes and inspire new ones. This eagerness to ask ourselves “what if?” has earned us a slew of accolades, a shelf full of awards and devoted customers who are always eager to try what CBC comes up with next.",
    String website;  //: http://www.cambrew.com/,
    String established;  //: "1989",
    String isOrganic;  //: "N",
    Image images;  //: {
    String status;  //: "verified",
    String statusDisplay;  //: "Verified",
    String createDate;  //: "2012-01-03 02:41:50",
    String updateDate;  //: "2015-12-22 14:42:31",
    String isMassOwned;  //: "N",
    String brandClassification;  //:
    Locations[] locations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameShortDisplay() {
        return nameShortDisplay;
    }

    public void setNameShortDisplay(String nameShortDisplay) {
        this.nameShortDisplay = nameShortDisplay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEstablished() {
        return established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }

    public String getIsOrganic() {
        return isOrganic;
    }

    public void setIsOrganic(String isOrganic) {
        this.isOrganic = isOrganic;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDisplay() {
        return statusDisplay;
    }

    public void setStatusDisplay(String statusDisplay) {
        this.statusDisplay = statusDisplay;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getIsMassOwned() {
        return isMassOwned;
    }

    public void setIsMassOwned(String isMassOwned) {
        this.isMassOwned = isMassOwned;
    }

    public String getBrandClassification() {
        return brandClassification;
    }

    public void setBrandClassification(String brandClassification) {
        this.brandClassification = brandClassification;
    }

    public Locations[] getLocations() {
        return locations;
    }

    public void setLocations(Locations[] locations) {
        this.locations = locations;
    }
}
