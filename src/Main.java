import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**    Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
         Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
         берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
         Мумкун болгон каталар:
         1) берилген маалымат терс сан болсо
         2) берилген маалымат сан эмес тамга болсо
         3) жана озунуздор берген кошумча каталар болсо да болот
         Параллелепипед:
         - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
         - Фигуранын коломун эсептеген формула: (length*width*height);
         -Формулалар Parallelepiped классында жазылуусу керек
         Цилиндр:
         - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
         - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
         -Формулалар Cylinder классында жазылуусу керек
         Бардык Exception дор логикасы main класста жазылcын
         Бардык маалмыттар консоль аркылуу берилсин
         Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.    **/

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.Parallelepiped
                    2.Cylinder
                    """);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    try {
                        System.out.print("Write length: ");
                        int length = scanner.nextInt();
                        if (length < 0) {
                            throw new MyException("Терс сан болбойт ");

                        }
                        System.out.print("Write width: ");
                        int width = scanner.nextInt();
                        if (width < 0) {
                            throw new MyException("Терс сан болбойт ");
                        }
                        System.out.print("Write height: ");
                        int height = scanner.nextInt();
                        if (height < 0) {
                            throw new MyException("Терс сан болбойт ");

                        }
                        Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                        System.out.println("\nParallelepiped Area: " + parallelepiped.ParallelepipedArea());
                        System.out.println("Parallelepiped Volume:" + parallelepiped.ParallelepipedVolume() + "\n");
                    } catch (MyException e) {
                        System.out.println(e.getMessage());

                    }
                }
                case 2 -> {
                    try {

                        System.out.print("Write height: ");
                        int height = scanner.nextInt();
                        if (height < 0) {
                            throw new MyException("Терс сан болбойт ");
                        }

                        System.out.print("Write radius: ");
                        int radius = scanner.nextInt();
                        if (radius < 0) {
                            throw new MyException("Терс сан болбойт ");
                        }

                        Cylinder cylinder = new Cylinder(height, radius);
                        System.out.println("\nCylinder Area: " + cylinder.CylinderArea());
                        System.out.println("Cylinder Volume: " + cylinder.CylinderVolume() + "\n");

                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}