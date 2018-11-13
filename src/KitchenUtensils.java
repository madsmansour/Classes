import java.awt.*;

public class KitchenUtensils {

    private int numbersOwned;
    private Color color;
    private Boolean usesPower;
    private String material;
    private String type;

    public int getNumbersOwned() {
        return numbersOwned;
    }

    public void setNumbersOwned(int numbersOwned) {
        this.numbersOwned = numbersOwned;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getUsesPower() {
        return usesPower;
    }

    public void setUsesPower(Boolean usesPower) {
        this.usesPower = usesPower;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public KitchenUtensils(int numbersOwned, Color color, Boolean usesPower, String material, String type) {
        this.numbersOwned = numbersOwned;
        this.color = color;
        this.usesPower = usesPower;
        this.material = material;
        this.type = type;
        System.out.println("A specific utensil has been created");
    }

    public KitchenUtensils() {
        System.out.println("a default utensil has been created");
    }

    public KitchenUtensils(int numbersOwned, boolean usesPower) {
        this.numbersOwned = numbersOwned;
        this.usesPower = usesPower;
        System.out.println("A 2 variable utensil has been created");
    }

    public void useUtensil() {
        System.out.println("The utensil is in use");
    }

    public void finishedUsingUtensil() {
        System.out.println("The utensil is not in use");
    }

    public int addExtraUtensil() {
        numbersOwned++;
        return  numbersOwned;
    }
    public String changeMaterial(String newMaterial){
        this.setMaterial(newMaterial);
        return newMaterial;
    }
    public Color changeColor(Color newColor){
        this.setColor(newColor);
        return  newColor;
    }

}




