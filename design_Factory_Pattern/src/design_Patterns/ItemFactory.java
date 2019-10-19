package design_Patterns;

import design_Patterns.items.Cable;
import design_Patterns.items.Light;
import design_Patterns.items.PaperRoll;

public class ItemFactory {

    Item createItem(String name){
        if (name == null){
            return null;
        }

        if (name.equalsIgnoreCase("cable")){
            return new Cable();
        }

        if(name.equalsIgnoreCase("light")){
            return new Light();
        }

        if (name.equalsIgnoreCase("PaperRoll")){
            return new PaperRoll();
        }

        return null;
    }
}
