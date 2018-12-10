package com.ao.gemini.practice.pattern.creationalPattern.state;

public class Context {
    public State state;
    public StartState startState;
    public FinshState finshState;



    public Context(){
        this.startState = new StartState(this);
        this.finshState = new FinshState(this);
        this.state = this.startState;
    }

    public void doSomeThing(){
        this.state.doSomeThing();
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public StartState getStartState() {
        return startState;
    }

    public void setStartState(StartState startState) {
        this.startState = startState;
    }

    public FinshState getFinshState() {
        return finshState;
    }

    public void setFinshState(FinshState finshState) {
        this.finshState = finshState;
    }
}
