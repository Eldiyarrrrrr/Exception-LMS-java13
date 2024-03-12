import java.util.Scanner;

public class Parallelepiped {
    private int length;
    private int width;
    private int height;


    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double ParallelepipedArea(){
        return 2*((height * length) + (length * width) + (height * width));
    }

    public double ParallelepipedVolume(){
        return  (length*width*height);
    }
}
