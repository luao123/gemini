package com.ao.gemini.practice.pattern.creationalPattern.state;

public class FinshState implements State {
    public Context context;


    @Override
    public void doSomeThing() {
        System.out.println("this is FinshState!");
    }

    public FinshState(Context context){
        this.context = context;
    }

}


