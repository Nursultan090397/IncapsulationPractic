public class SafeIntance {

    public static void main(String[] args) {
        Car Porsche = new Car();
        System.out.println(Porsche.toString());

        Car Bentley = new Car();
        Bentley.setCar(" Bentley ", " зеленый ", " седан ");
        System.out.println(Bentley.toString());
    }
}