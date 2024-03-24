import java.util.InputMismatchException;
import java.util.Scanner;

import file.Problems1;
import file.Problems2;
import excep.Problems3;
import excep.Problems4;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so bai tap: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                Problems1 problems1 = new Problems1();
                break;
            case 2:
                Problems2 problems2 = new Problems2();
                break;
            case 3:
                Problems3 problems3 = new Problems3();
                break;
            case 4:
                Problems4 problems4 = new Problems4();
                break;
            default:
                System.out.println("Khong co bai tap nay");
        }
    }
}