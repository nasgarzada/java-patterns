package patterns.composition.domain;

import patterns.composition.domain.coffee.Coffee;
import patterns.composition.domain.coffee.CoffeeType;
import patterns.composition.domain.coffee.CupSize;
import patterns.composition.domain.condiment.syrup.Caramel;

public class Main {
    public void run(){
        var caramelSyrup = new Caramel(2);
        var totalCost = new Coffee()
            .type(CoffeeType.AMERICANO)
            .cupSize(CupSize.MEDIUM)
            .withCondiment(caramelSyrup)
            .totalCost();
        System.out.println(totalCost);
    }
}
