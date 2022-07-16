package ua.levelup;

public class Sorter implements Sort{
    int variant;
    SortSelection ss = new SortSelection();
    SortBubble sb = new SortBubble();

    public int[] SortArray(int[] unsorted, int variant){
        this.variant = variant;
        return sort(unsorted);
    }

    @Override
    public int[] sort(int[] array){
        switch (variant){
            case 1:
                return ss.sort(array);
            case 2:
                return sb.sort(array);
        }
        return new int[0];
   }
}
