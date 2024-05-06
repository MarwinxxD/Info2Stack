public class FreightContainer {

    int cargoWeight;
    int emptyWeight = 3900;

    public FreightContainer(int emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public FreightContainer() {}

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getTotalWeight() {
        return emptyWeight + cargoWeight;
    }


}
