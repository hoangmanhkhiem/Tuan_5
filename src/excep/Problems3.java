package excep;

import java.util.Scanner;

public class Problems3 {
    private int count = 0;
    public Problems3(){
        try {
            boolean ok = input();
            System.out.println(ok+", co "+count+" so");
        } catch (InvalidNumberException e) {
            System.out.println("false");
        }
    }

    public boolean input() throws InvalidNumberException{
        String n;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextLine();
            String[] strsplit = n.split(" ");
            for (String s : strsplit) {
                try {
                    double x = Double.parseDouble(s);
                    count++;
                } catch (NumberFormatException e) {
                    throw new InvalidNumberException(s + " khong phai la 1 so");
                }
            }
        }
        return true;
    }
}
