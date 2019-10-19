package design_Patterns.states;

import design_Patterns.Context;
import design_Patterns.State;

public class Work implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Work start");
        context.setState(this);
    }

    @Override
    public String actionIs() {
        return "Okey going to work now";
    }
}
