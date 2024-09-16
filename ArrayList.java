public class ArrayList<E> implements List<E>{
    private E[] data;
    private int size;

    public ArrayList()
    {
        data = (E[])new Object[10];
        size = 0;
    }
    // (adds to the end of the list.  If necessary, handles the creation of a larger internal array, and copies values from the old array to the new one)
    public void add(E val){

    }
    // (which inserts at position index, and shifts everything else to the right as necessary.  If necessary, handles the creation of a larger internal array, and copies values from the old array to the new one.  Should only allow adding to positions 0 through size.  Otherwise, should throw in IndexOutOfBoundsException.)
    public void add(int index, E val){

    }
    // (which replaces the element at position index with x.)
    public void set(int index, E val){

    }
    public void clear(){

    }// (results in .size() returning 0) and .get(0) throwing a new IndexOutOfBoundsException()
    public E remove(int index){
        throw new UnsupportedOperationException();
    }// (removes the value at position index.  Shifts everything else to the left as necessary.  Should only allow removal from a valid index in the list.)
    public E get(int index){
        throw new UnsupportedOperationException();
    }// (returns the value at position index, or throws a new IndexOutOfBoundsException)
    public int size(){
        throw new UnsupportedOperationException();
    }// (returns the number of items in the list.  -- NOT the capacity of the array, but the number of values intentionally placed in the list)
    public boolean isEmpty(){
        throw new UnsupportedOperationException();
    }//(returns true if .size() is 0)
    public boolean contains(E val){
        throw new UnsupportedOperationException();
    }// (returns true if the IntegerArrayList contains the given val, false otherwise)
    public int indexOf(E val){
        throw new UnsupportedOperationException();
    }// (returns the index of the first instance of val that appears in the IntegerArrayList, or -1 if it does not appear)
    public boolean equals(List<E> other){
        throw new UnsupportedOperationException();
    }// (returns true if this IntegerArrayList and the other IntegerArrayList have all of the same elements in the same order.
    public String toString(){
        throw new UnsupportedOperationException();
    }// returns a nice representation of all of the elements in the IntegerArrayList with commons, and square brackets.

}
