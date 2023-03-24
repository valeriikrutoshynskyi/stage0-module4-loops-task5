package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        int j;
        for (int i = 1; i <= sideLength; i++) {
            if (i == 1 || i == sideLength)
                for (j = 1; j <= sideLength; j++)
                    System.out.print(8);
            else
                for (j = 1; j <= sideLength; j++)
                    if (j == 1 || j == sideLength)
                        System.out.print(8);
                    else
                        System.out.print(" ");
            System.out.print("\n");
        }
    }
}

