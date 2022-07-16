package ua.levelup;

public class SortSelection implements Sort{
    @Override
    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minEl = array[i];
            int exchPos = i + 1;
            for (int j = i + 1; j < array.length; j++) {
                if(minEl > array[j]){
                    minEl = array[j];
                    exchPos = j;
                }
            }
            if (minEl != array[i]){
                array[exchPos] = array[i];
                array[i] = minEl;
            }
        }
        return array;
    }
}
