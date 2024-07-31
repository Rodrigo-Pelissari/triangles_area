public class EquilateralTriangle implements Triangles{

// area calculation function for the equilateral triangle
    @Override
    public double calculateArea(double firstSide, double secondSide, double thirdSide){
        return (Math.sqrt(3) / 4) * Math.pow(firstSide, 2);
    }

}