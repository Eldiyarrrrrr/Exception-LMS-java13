import static java.lang.Math.PI;

public class Cylinder {
    private int height;
    private int radius;

    public Cylinder(int height,int radius) {
        this.height=height;
        this.radius=radius;
    }


    public double CylinderArea(){
        return 2*PI * radius*( height + radius);
    }

    public double CylinderVolume(){
        return   (PI*radius*radius*height);
    }


}
    