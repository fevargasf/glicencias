package co.gov.coran.licencias.utils;
import com.google.common.io.Files;


import java.util.ArrayList;
import java.util.Arrays;

public class FileUtils {
    private static ArrayList<String> compressedExtensions =new ArrayList<>(Arrays.asList("zip","rar","tar"));

    public static boolean isCompressed(String fileName){
        String ext = Files.getFileExtension(fileName);
        return compressedExtensions.contains(ext);
    }
}
