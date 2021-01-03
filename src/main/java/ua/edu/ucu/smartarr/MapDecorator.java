package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    private final MyFunction func;

    public MapDecorator(SmartArray sa, MyFunction func) {
        super(sa);
        this.func = func;
        apply();
    }

    @Override
    public String operationDescription() {
        return "Map every element to another object using MyFunction";
    }

    @Override
    public void apply() {
        Object[] applied = new Object[size()];
        for (int idx = 0; idx < size(); idx++){
            applied[idx] = func.apply(arr[idx]);
        }
        arr = applied;
    }
}
