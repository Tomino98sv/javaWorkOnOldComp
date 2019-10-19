package design_Patterns.items;

import design_Patterns.Item;

public class Light implements Item {
    @Override
    public double size() {
        return 5;
    }

    @Override
    public String name() {
        return "I am Light";
    }
}
