package design_Patterns.items;

import design_Patterns.Item;

public class PaperRoll implements Item {
    @Override
    public double size() {
        return 20;
    }

    @Override
    public String name() {
        return "I am soft PaperRoll";
    }
}
