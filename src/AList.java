public class AList {
    public Object[] array;
    private int size = 0;
    private int maxSize = 0;

    public AList() {
        this.array = new Object[this.maxSize];
    }

    public void listAdd(Object p) {
        if (maxSize == size) {
            Object[] newArray = new Object[maxSize + 1];

            for(int i = 0; i < array.length; ++i) {
                newArray[i] = array[i];
            }

            array = newArray;
            ++maxSize;
        }

        array[size] = p;
        ++size;
    }

    public void listRemove(int pos) {
        if (pos >= 0 && pos < size) {
            for(int i = pos; i < size - 1; ++i) {
                array[i] = array[i + 1];
            }

            --size;
        }

    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += array[i] + "\n";
        }
        return result;
    }

}

