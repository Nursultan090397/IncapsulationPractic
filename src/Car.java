public class Car {
    private String maker;
    private String color;
    private String bodyType;

    public Car() {
        maker = " Porsche";
        color = " Serebristiy";
        bodyType = " Kupe ";
    }

    private String accelerate() {
        String motion = "Ускоряется...";
        return motion;
    }

    public void setCar (String brand, String paint , String style)
    {
        maker = brand;
        color = paint;
        bodyType = style;

    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }





    }


