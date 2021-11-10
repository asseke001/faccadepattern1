public class FacadeForCar {

    private Car lada;
    private Car toyota;
    private Car mercedes;

    public FacadeForCar(){
        this.lada = new Lada();
        this.toyota = new Toyota();
        this.mercedes = new Mercedes();
    }

    public void buildLada(){
        Lada.build();
    }

    public void buildToyota(){
        Toyota.build();
    }

    public void buildMercedes(){
        Mercedes.build();
    }

}