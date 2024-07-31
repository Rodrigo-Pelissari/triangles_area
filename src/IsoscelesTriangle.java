public class IsoscelesTriangle implements Triangles {
    double base, side;
    
    // Define the base of the isosceles triangle
    public void baseDefine(double firstSide, double secondSide, double thirdSide){
        if(firstSide == secondSide){
            this.base = thirdSide;
            this.side = firstSide;
        }
        if(firstSide == thirdSide){
            this.base = secondSide;
            this.side = firstSide;
        }
        this.base = firstSide;
        this.side = secondSide;
    }

    // Find the height of the triangle using the Pythagorean theorem
    public double calculateHeight(double base, double side){
        return Math.sqrt(Math.pow(side, 2) - Math.pow((base/2), 2));
    }

    // Then, calculate the area of ​​the isosceles triangle
    @Override
    public double calculateArea(double firstSide, double secondSide, double thirdSide){
        baseDefine(firstSide, secondSide, thirdSide);
        double height = calculateHeight(base, side);
        return (side * height) / 2;
    }

}

