package patterns.composition.domain.condiment;

import java.math.BigDecimal;

public class Milk implements Condiment {
    private BigDecimal size;

    public Milk(BigDecimal size) {
        this.size = size;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(2.4).multiply(this.size);
    }

    @Override
    public void prepare() {
        System.out.println("Adding milk...");
        System.out.println("Milk cost: " + this.cost());
    }

}
