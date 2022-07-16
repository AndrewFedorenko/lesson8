package ua.levelup;

import java.io.FileInputStream;
import java.nio.charset.Charset;

public class ArrayUtils {

    static void printArray(int[] arr, String top){
        System.out.println(top);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-1s ", arr[i]);
        }
        System.out.println();
    }

    public static int[] returnArray()  {

        final String FILENAME = "array.txt";

        byte[] fileInfo = readFromFile(FILENAME);
        if (fileInfo.length > 0) {
            String strInfo = new String(fileInfo, Charset.defaultCharset());

            String[] strArray = strInfo.split(";");
            int[] array = new int[strArray.length];
            for (int i = 0; i <strArray.length ; i++) {
                array[i] = Integer.parseInt(strArray[i].trim());
            }
            return array;
        }
        return new int[0];
    }

    public static byte[] readFromFile(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int available = fileInputStream.available();
            byte[] buffer = new byte[available];
            fileInputStream.read(buffer);
            return buffer;
        } catch (Exception ignored) {
        }
        return new byte[0];

    }

}
