package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int row, col, space = 0;
        for (row = 1; row <= height; row++) {
            for (col = 1; col <= height; col++) {
                if (col <= space || col > height - space) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            if (row <= height / 2) {
                space++;
            } else {
                space--;
            }
            System.out.println();
        }
    }
}