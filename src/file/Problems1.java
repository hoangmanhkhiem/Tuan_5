package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Problems1 {
    public Problems1() {
        String str = "K:\\JavaProjects\\Tuan_5\\src\\file\\test.txt";
        try {
            readFileProperties(str);
            changeFileProperties(str);
            readFileProperties(str);
        } catch (FileNotFoundException e) {
            System.out.println("Khong co file");
        }

    }

    public void readFileProperties(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        System.out.println("File co the doc: " + file.canRead());
        System.out.println("File co the ghi: " + file.canWrite());
        System.out.println("File co kich thuoc: " + file.getTotalSpace());
        System.out.println("File co duong dan: " + file.getPath());
        System.out.println("File co ten: " + file.getName());
    }

    public void changeFileProperties(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        file.setReadable(true);
        file.setWritable(true);
    }

    public static void main(String[] args) {
        Problems1 bai1 = new Problems1();
    }
}
