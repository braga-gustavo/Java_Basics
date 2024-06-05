package Collects.GeometryExample;

public class Circle implements GeometricForms {

    private Double circleRadius;

    public Double calculateArea() {
        Double circleArea = Math.PI * (Math.pow((circleRadius), 2));
        return circleArea;
    }

    public Circle(Double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public Double getCircleRadius(){
        return circleRadius;
    }
}