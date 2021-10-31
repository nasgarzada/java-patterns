package patterns.composition.domain.coffee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import patterns.composition.domain.condiment.Condiment;

public class Coffee {
    private List<Condiment> condiments;
    private CoffeeType type;
    private CupSize cupSize;

    public Coffee() {
        this.condiments = new ArrayList<>();
    }

    public Coffee type(CoffeeType type) {
        this.type = type;
        return this;
    }

    public Coffee cupSize(CupSize size) {
        this.cupSize = size;
        return this;
    }

    public Coffee withCondiment(Condiment condiment) {
        this.condiments.add(condiment);
        return this;
    }

    public BigDecimal totalCost() {
        var cofeeBaseCost = this.type.getBasePrice().multiply(this.cupSize.getWeight());

        var condimentsTotalCost = this.condiments.stream().map(Condiment::cost).reduce(BigDecimal.ZERO,
                (subtotal, element) -> subtotal.add(element));

        return cofeeBaseCost.add(condimentsTotalCost);
    }

}
