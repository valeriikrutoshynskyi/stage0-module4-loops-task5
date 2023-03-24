package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            return;
        }
        for (int row = 0; row < sideLength; row++) {
            for (int col = 0; col < sideLength; col++) {
                if (row == sideLength / 2 || col == sideLength / 2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
