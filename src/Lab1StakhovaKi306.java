import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** 
 * Lab1StakhovaKI306
 * 
 * Лабораторна робота №1.
 * Програма створює зубчатий масив, який зберігає заштриховану область
 * квадратної матриці у вигляді трикутника:
 *
 * Функціонал:
 * <ul>
 * <li>Користувач вводить розмір квадратної матриці {@code n} та
 * символ-заповнювач.</li>
 * <li>Формує зубчатий масив із заштрихованими елементами.</li>
 * <li>Виводить масив на екран і зберігає його у файл {@code output.txt}.</li>
 * </ul>
 * 
 * @author
 * @version 1.1
 */

public class Lab1StakhovaKi306 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        int nRows = in.nextInt();
        in.nextLine();
        System.out.print("\nВведіть символ-заповнювач: ");
        String filler = in.nextLine();
        int center = nRows / 2;

        for(int i = 0; i <= nRows; ++i) {
            for(int j = 0; j <= nRows; ++j) {
                if (i >= center && j >= center - (i - center) && j <= center + (i - center)) {
                    System.out.print(filler);
                    fout.print(filler);
                } else {
                    System.out.print(" ");
                    fout.print(" ");
                }
            }

            System.out.println();
            fout.println();
        }

        fout.flush();
        fout.close();
    }
}
