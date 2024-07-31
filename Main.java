import java.util.Scanner;

enum triangle_t{
    EQUILATERAL,
    SCALENE,
    ISOSCELES
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;

        //Receiving the values ​​of the sides
        System.out.println("Vamos calcular a área do seu triângulo.");
        System.out.println("Por favor, digite as medidas em centímetros.");

        System.out.print("Digite a medida do primeiro lado: ");
        double firstSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\nDigite a medida do segundo lado: ");
        double secondSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("\nDigite a medida do terceiro lado: ");
        double thirdSide = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        // select triangle type
        triangle_t triangleType = setTriangle(firstSide, secondSide, thirdSide);

        // calculate the area based on the selected triangle type
        switch(triangleType){  
            // equilateral
            case EQUILATERAL:
            EquilateralTriangle equilateral = new EquilateralTriangle();
            area = equilateral.calculateArea(firstSide, secondSide, thirdSide);
            break;

            // scalene
            case SCALENE:
            ScaleneTriangle scalene = new ScaleneTriangle();
            area = scalene.calculateArea(firstSide, secondSide, thirdSide);
            break;

            // isosceles
            case ISOSCELES:
            IsoscelesTriangle isosceles = new IsoscelesTriangle();
            area = isosceles.calculateArea(firstSide, secondSide, thirdSide);   
            break;

            default:
            area = 0;
            break;
        }
    
        System.out.println("Área calculada! Valor: " + area);
    }

    // Function to set the type of triangle
    static triangle_t setTriangle(double firstSide, double secondSide, double thirdSide){

        // check Equilateral Triangle
        if(firstSide == secondSide && firstSide == thirdSide){
            return triangle_t.EQUILATERAL;
        }

        // check Scalene Triangle
        if(firstSide != secondSide && firstSide != thirdSide){
            return triangle_t.SCALENE;
        }

        // return Isosceles Triangle
        return triangle_t.ISOSCELES;
    }
}