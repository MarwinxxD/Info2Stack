package zehn;

import java.util.ArrayList;

public class Freighter {

    int maxWeight;

    int currWeight;

    ArrayList<FreightContainer> container = new ArrayList<>();

    public Freighter(int maxWeight) {
        this.maxWeight = maxWeight;
        currWeight = 0;
    }

    public boolean addContainer(FreightContainer box) {
        if (currWeight + box.getTotalWeight() < maxWeight) {
            currWeight = currWeight + box.getTotalWeight();
            return container.add(box);
        }
        return false;
    }

    public void removeContainer(int index) {
        currWeight = currWeight - container.get(index).getTotalWeight();
        container.remove(index);
    }

    public double calculateContainerWeight() {
        double amount = 0;
        for(int i = 0; i < container.size(); i++) {
            amount = amount + container.get(i).getTotalWeight();
        }
        return amount;
    }
}
