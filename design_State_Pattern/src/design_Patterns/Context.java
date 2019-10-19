package design_Patterns;

public class Context {
    private State state;

    public Context(){
        this.state=null;
    }

    public void setState(State state){
        this.state=state;
    }

    State getState(){
        return state;
    }

}
