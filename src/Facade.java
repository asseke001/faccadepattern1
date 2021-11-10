public class Facade {

    public static void main(String[] args) {
        FacadeForCar facadeForCar = new FacadeForCar();

        facadeForCar.buildLada();
        facadeForCar.buildToyota();
        facadeForCar.buildMercedes();
    }
}