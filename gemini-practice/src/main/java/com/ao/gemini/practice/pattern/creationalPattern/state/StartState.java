package com.ao.gemini.practice.pattern.creationalPattern.state;

public class StartState implements State {
    public Context context;

    @Override
    public void doSomeThing() {
        System.out.println("this is StartState!");
        context.setState(context.getFinshState());
    }

    public StartState(Context context) {
        this.context = context;
    }

}
