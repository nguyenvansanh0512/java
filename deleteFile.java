import java.io.File;
import java.util.Scanner;

public class deleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong dan file can xoa: ");
        String filePath = sc.nextLine();

        File directory = new File(filePath);

        delete(directory);
    }

    private static void delete(File directory) {
        if (!directory.exists()) {
            System.out.println("Khong tim thay file hoac thu muc.");
            return;
        }

        if (directory.isFile()) {
            directory.delete();
            System.out.println("File da bi xoa: " + directory.getAbsolutePath());
        } else {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    delete(file);
                }
            }
            directory.delete();
            System.out.println("Thuc muc da bi xoa " + directory.getAbsolutePath());
        }
    }
}
