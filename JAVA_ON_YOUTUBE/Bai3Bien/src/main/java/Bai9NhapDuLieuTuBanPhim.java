
import java.util.Scanner;

/**
 *
 * @author huynguyen
 */
public class Bai9NhapDuLieuTuBanPhim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap mot so nguyen:");
//        int a = scanner.nextInt(); // đọc vào một số nguyên
//        System.out.println("Nhap vao mot so float:");
//        float floatValue = scanner.nextFloat(); // đọc vào một số thực
//        System.out.println("Nhap vao mot so thuc:");
//        double doubleValue = scanner.nextDouble();
//        
//        System.out.println(a + "-" + floatValue + "-" + doubleValue);

        System.out.println("Nhap vao mot ki tu:");
        char c = scanner.next().charAt(0); // đọc vào một kí tự
        System.out.println("Ki tu vua nhap: " + c);

        System.out.println("Nhap vao mot tu:");
        String word = scanner.next(); //  đọc vào  một từ
        System.out.println("Tu vua nhap: " + word);
        
        scanner.nextLine();
        
        System.out.println("Nhap vao mot dong:");
        String line = scanner.nextLine(); // đọc vào một dòng
        System.out.println("Dong vua nhap: " + line);

        System.out.println("Nhap vao mot gia tri kieu true/false:");
        boolean booleanValue = scanner.nextBoolean(); // đọc vào giá trị kiểu boolean 
        System.out.println("Gia tri boolean vua nhap: " + booleanValue);
    }
}
