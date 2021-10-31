package patterns.composition.domain.coffee;

import java.math.BigDecimal;

public enum CupSize {
    MINI(BigDecimal.valueOf(1)), SMALL(BigDecimal.valueOf(1.2)), MEDIUM(BigDecimal.valueOf(1.4)),
    LARGE(BigDecimal.valueOf(1.6)),;

    private BigDecimal weight;

    private CupSize(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }
}
