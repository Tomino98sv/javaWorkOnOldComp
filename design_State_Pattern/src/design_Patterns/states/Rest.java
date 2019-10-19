package design_Patterns.states;

import design_Patterns.Context;
import design_Patterns.State;

public class Rest implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Rest start");
        context.setState(this);
    }

    @Override
    public String actionIs(){
        return "I am going to REST some time";
    }
}
