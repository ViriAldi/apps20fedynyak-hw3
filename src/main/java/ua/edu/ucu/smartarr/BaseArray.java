package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    private final Object[] arr;

    public BaseArray(Object[] array){
        Object[] arrayCpy = new Object[array.length];
        System.arraycopy(array, 0, arrayCpy, 0, array.length);
        this.arr = arrayCpy;
    }

    public Object[] toArray() {
        Object[] basicArray = new Object[size()];
        System.arraycopy(arr, 0, basicArray, 0, size());
        return basicArray;
    }

    public String operationDescription() {
        return "JustBaseArray";
    }

    public int size() {
        return arr.length;
    }
}
