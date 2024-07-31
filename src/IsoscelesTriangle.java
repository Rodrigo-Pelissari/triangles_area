public class IsoscelesTriangle implements Triangles {
    //First, we need to find the height of the triangle using the Pythagorean theorem
    public double calculateHeight(double base, double side){
        return Math.sqrt(Math.pow(side, 2) - Math.pow((base/2), 2));
    }

    // Then, calculate the area of ​​the isosceles triangle
    @Override
    public double calculateArea(double firstSide, double secondSide, double thirdSide){
        // base = firstSide, side(equals) = secondSide
        double height = calculateHeight(firstSide, secondSide);
        return (firstSide * height) / 2;
    }

}

