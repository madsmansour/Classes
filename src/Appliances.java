import java.awt.*;

public class Appliances extends KitchenUtensils {

    String appType;

    public Appliances(int numbersOwned, Color color, Boolean usesPower, String material, String type, String appType) {
        super(numbersOwned, color, usesPower, material, type);
        this.appType = appType;
        System.out.println("the type is " + appType);
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }
}
