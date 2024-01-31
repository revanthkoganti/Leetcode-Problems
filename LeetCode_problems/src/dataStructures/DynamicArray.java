package dataStructures;


class DynamicArray {
    private int[] arr;
    private int j;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            arr = new int[capacity];
        } 
        j = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (j == arr.length) {
            resize();
        }
        arr[j] = n;
        j++;
    }

    public int popback() {

        int poppedElement = arr[j - 1];
        arr[j - 1] = 0;
        j--;
        return poppedElement;
    }

    private void resize() {
        int[] tmp = new int[arr.length * 2];
        for (int k = 0; k < arr.length; k++) {
            tmp[k] = arr[k];
        }
        arr = tmp;
    }

    public int getSize() {
        return j;
    }

    public int getCapacity() {
        return arr.length;
    }
}
