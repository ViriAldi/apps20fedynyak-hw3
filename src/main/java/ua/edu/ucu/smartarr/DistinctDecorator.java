package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray sa) {
        super(sa);
        apply();
    }

    @Override
    public String operationDescription() {
        return "Remove duplicates from SmartArray. Use method equals() to compare objects";
    }

    @Override
    public void apply() {
        Object[] removed = new Object[size()];
        int idx = 0;
        for (Object item: arr){
            boolean contains = false;
            for (int i = 0; i < idx; i++){
                if (item.equals(removed[i])){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                removed[idx] = item;
                idx++;
            }
        }
        Object[] finallyRemoved = new Object[idx];
        System.arraycopy(removed, 0, finallyRemoved, 0, idx);
        arr = finallyRemoved;
    }
}
