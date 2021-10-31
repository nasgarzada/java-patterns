package patterns.composition.domain.coffee;

import java.math.BigDecimal;

public enum CoffeeType {
    AMERICANO(BigDecimal.valueOf(1.2)), ESPRESSO(BigDecimal.valueOf(0.8));

    private BigDecimal basePrice;

    private CoffeeType(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

}
