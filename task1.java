import java.util.Scanner;
    


public class task1 {
    public static void main(String[] args) {
        int rings = readNumberOfRings();

        SortKhanoi('a', 'b', 'c', rings);
    }

    private static int readNumberOfRings() {
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true) {
                System.out.printf("Please enter number of rings: ");
                String line = iScanner.nextLine();
                try {
                    int rings = Integer.parseInt(line);
                    if (rings <= 0) {
                        System.out.printf("Number of rings should be a positive number\n");
                    } else {
                        return rings;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Number of rings should be an integer");
                }
            }
        }
    }

    public static void printMove(char pin1, char pin2) {
        System.out.println(pin1 + "-->" + pin2);
    }

    static void SortKhanoi(char pin1, char pin2, char pin3, int disksNumber) {
        if (disksNumber == 1) {
            printMove(pin1, pin2);
        } else {
            SortKhanoi(pin1, pin3, pin2, disksNumber - 1);
            printMove(pin1, pin2);
            SortKhanoi(pin3, pin2, pin1, disksNumber - 1);
        }
    }
}