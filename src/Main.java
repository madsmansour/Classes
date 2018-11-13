import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.black;

public class Main {

    public static void main(String[] args) {
        KitchenUtensils fork = new KitchenUtensils();
        KitchenUtensils knife = new KitchenUtensils(25, black, false, "metal", "cutlery");
        KitchenUtensils blender = new KitchenUtensils(1, true);
        System.out.println(knife.getColor());

        knife.useUtensil();
        knife.addExtraUtensil();
        System.out.println(knife.getNumbersOwned());
        System.out.println(knife.getMaterial());
        knife.changeMaterial("Wood");
        System.out.println(knife.getMaterial());
        System.out.println(knife.getColor());
        knife.changeColor(Color.PINK);
        System.out.println(knife.getColor());
        Appliances oven = new Appliances(1,BLACK,true,"metal","lol","appliance");


    }
}
