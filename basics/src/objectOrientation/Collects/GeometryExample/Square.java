package Collects.GeometryExample;

public class Square implements GeometricForms {
    private Double baseValue;
    private Double heightVaule;

    public Square(Double baseValue, Double heightVaule) {
        this.baseValue = baseValue;
        this.heightVaule = heightVaule;
    }

    public Double calculateArea() {
        Double squareArea = baseValue * heightVaule;
        return squareArea;
    }
}
