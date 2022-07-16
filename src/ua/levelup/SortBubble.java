package ua.levelup;

public class SortBubble implements Sort{
    @Override
    public int[] sort(int[] array) {

        int buffer;
        boolean modificated = true;

        while (modificated){
            modificated = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i]>array[i+1]){
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                    modificated = true;
                }
            }
        }
        return array;
    }
}
