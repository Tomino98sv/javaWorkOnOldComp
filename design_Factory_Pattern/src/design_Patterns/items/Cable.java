package design_Patterns.items;

import design_Patterns.Item;

public class Cable implements Item {
    @Override
    public double size() {
        return 8;
    }

    @Override
    public String name() {
        return "I am long cable";
    }
}
