package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private final MyPredicate pr;

    public FilterDecorator(SmartArray sa, MyPredicate pr) {
        super(sa);
        this.pr = pr;
        apply();
    }

    @Override
    public String operationDescription() {
        return "Tests every element and removes it if it doesn't satisfy MyPredicate";
    }

    @Override
    public void apply() {
        Object[] filtered = new Object[size()];
        int idx = 0;
        for (Object item: arr){
            if (pr.test(item)){
                filtered[idx] = item;
                idx++;
            }
        }
        Object[] finalFiltered = new Object[idx];
        System.arraycopy(filtered, 0, finalFiltered, 0, idx);
        arr = finalFiltered;
    }
}
