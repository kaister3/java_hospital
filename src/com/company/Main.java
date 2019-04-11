package com.company;

import javax.script.*;

public class Main{

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            engine.eval("print('Hello, world');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
