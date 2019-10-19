package design_Patterns.states;

import design_Patterns.Context;
import design_Patterns.State;

public class Stay implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Stay start");
        context.setState(this);
    }

    @Override
    public String actionIs() {
        return "Staying here";
    }

}
