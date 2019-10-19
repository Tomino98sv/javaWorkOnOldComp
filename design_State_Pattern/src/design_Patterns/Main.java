package design_Patterns;

import design_Patterns.states.Rest;
import design_Patterns.states.Stay;
import design_Patterns.states.Work;

public class Main {

    public static void main(String[] args) {

        Context jozo = new Context();
        Context juraj = new Context();

        Rest restState = new Rest();
        Stay stayState = new Stay();
        Work workState = new Work();

        restState.doAction(juraj);

        stayState.doAction(jozo);

        workState.doAction(jozo);

        System.out.println(jozo.getState().actionIs());
        System.out.println(juraj.getState().actionIs());
    }
}
