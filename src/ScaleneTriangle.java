public class ScaleneTriangle implements Triangles {

    //First, we need to calculate the semiperimeter
    public double calculateSemiperimeter(double firstSide, double secondSide, double thirdSide){
        return (firstSide + secondSide + thirdSide) / 2;
    }

    // Then, calculate the area of ​​the scalene triangle
    @Override
    public double calculateArea(double firstSide, double secondSide, double thirdSide){
        double semiperimeter = calculateSemiperimeter(firstSide, secondSide, thirdSide);
        return Math.sqrt(semiperimeter * (semiperimeter - firstSide) * (semiperimeter - secondSide) * (semiperimeter - thirdSide));
    }

}
