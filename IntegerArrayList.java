public class IntegerArrayList implements IntegerList{
    private Integer[] data;
    private int size;

    public IntegerArrayList()
    {
        data = new Integer[10];
        size = 0;
    }

    private void resizeInternalArrayIfNecessary()
    {
        if (size >= data.length)
        {
            Integer[] biggerArray = new Integer[data.length * 2];
            for(int i=0; i<data.length; i++)
                biggerArray[i] = data[i];
            data = biggerArray;
        }
    }
    // (adds to the end of the list.  If necessary, handles the creation of a larger internal array, and copies values from the old array to the new one)
    public void add(Integer val){
        resizeInternalArrayIfNecessary();
        data[size] = val;
        size++;
    }
    // (which inserts at position index, and shifts everything else to the right as necessary.  If necessary, handles the creation of a larger internal array, and copies values from the old array to the new one.  Should only allow adding to positions 0 through size.  Otherwise, should throw in IndexOutOfBoundsException.)
    public void add(int index, Integer val){
        resizeInternalArrayIfNecessary();
        for (int i = size; i > index; i--)
            data[i] = data[i-1];
        data[index] = val;
    }
    // (which replaces the element at position index with x.)
    public void set(int index, Integer val){

    }
    // (results in .size() returning 0) and .get(0) throwing a new IndexOutOfBoundsException()
    public void clear(){

    }
    // (removes the value at position index.  Shifts everything else to the left as necessary.  Should only allow removal from a valid index in the list.)
    public Integer remove(int index){
        throw new UnsupportedOperationException();
    }
    // (returns the value at position index, or throws a new IndexOutOfBoundsException)
    public Integer get(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index: " + index);
        return data[index];
    }
    // (returns the number of items in the list.  -- NOT the capacity of the array, but the number of values intentionally placed in the list)
    public int size(){

        throw new UnsupportedOperationException();
    }
    //(returns true if .size() is 0)
    public boolean isEmpty(){

        throw new UnsupportedOperationException();
    }
    // (returns true if the IntegerArrayList contains the given val, false otherwise)
    public boolean contains(Integer val){

        throw new UnsupportedOperationException();
    }
    // (returns the index of the first instance of val that appears in the IntegerArrayList, or -1 if it does not appear)
    public int indexOf(Integer val){

        throw new UnsupportedOperationException();
    }
    // (returns true if this IntegerArrayList and the other IntegerArrayList have all of the same elements in the same order.
    public boolean equals(List<Integer> other){

        throw new UnsupportedOperationException();
    }
    // returns a nice representation of all of the elements in the IntegerArrayList with commons, and square brackets.
    public String toString(){
        String result = "[";
        for(int i=0; i<size-1; i++)
        {
            result += data[i] + ",";
        }
        result += data[size-1] + "]";
        return result;
    }
}
