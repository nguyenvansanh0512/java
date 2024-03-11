import java.io.File;
import java.util.Scanner;

public class fileSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap duong dan file: ");
        String filePath = sc.nextLine();

        File file = new File(filePath);
        if (file.exists()) {
            long fileSizeBytes = file.length();
            double fileSizeKilobytes = fileSizeBytes / 1024.0;
            double fileSizeMegabytes = fileSizeKilobytes / 1024.0;

            System.out.println("Do lon cua file:");
            System.out.printf("Bytes: ̀%d%n", fileSizeBytes);
            System.out.printf("Kilobytes: %.2f KB%n", fileSizeKilobytes);
            System.out.printf("Megabytes: %.2f MB%n", fileSizeMegabytes);
        }else{
            System.err.println("Duong dan file khong hop le!");
        }
        sc.close();
    }
}