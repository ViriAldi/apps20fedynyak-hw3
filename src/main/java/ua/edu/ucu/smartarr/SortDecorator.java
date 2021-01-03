package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private final MyComparator cmp;

    public SortDecorator(SmartArray sa, MyComparator cmp) {
        super(sa);
        this.cmp = cmp;
        apply();
    }

    @Override
    public String operationDescription() {
        return "Sorts elements using MyComparator to compare them";
    }

    @Override
    public void apply() {
        Object[] sorted = toArray();
        Arrays.sort(sorted, cmp);
        arr = sorted;
    }
}
