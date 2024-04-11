package compiler.machines;

public class ABCMachine extends compiler.StateMachine {
    
    public void initStateTable() {
        compiler.State startState = new compiler.State("start", false);
        startState.addTransition('A', "start");
        startState.addTransition('B', "expectB");
        addState(startState);

        compiler.State expectBState = new compiler.State("expectB", false);
        expectBState.addTransition('B', "expectB");
        expectBState.addTransition('C', "expectC");
        addState(expectBState);

        compiler.State expectCState = new compiler.State("expectC", true);
        expectCState.addTransition('C', "expectC");
        addState(expectCState);
    }

    @Override
    public String getStartState() {
        return "start";
    }

    public compiler.TokenIntf.Type getType() {
        return compiler.TokenIntf.Type.EOF;
    }
   
}


