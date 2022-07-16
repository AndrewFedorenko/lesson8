package ua.levelup;

public class Sorter implements Sort{
    Sort sort;
    public int[] sortArray(int[] unsorted, Sort ob){
        this.sort = ob;
        return sort(unsorted);
    }

    @Override
    public int[] sort(int[] array){
        return sort.sort(array);
   }
}
