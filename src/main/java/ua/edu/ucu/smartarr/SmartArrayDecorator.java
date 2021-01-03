package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;
    protected Object[] arr;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
        this.arr = smartArray.toArray();
    }

    public Object[] toArray() {
        Object[] basicArray = new Object[size()];
        System.arraycopy(this.arr, 0, basicArray, 0, size());
        return basicArray;
    }

    public abstract void apply();

    public int size(){
        return arr.length;
    }
}
