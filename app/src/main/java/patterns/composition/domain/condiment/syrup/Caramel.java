package patterns.composition.domain.condiment.syrup;

import java.math.BigDecimal;

public class Caramel implements Syrup {
    private Integer shot;

    public Caramel(Integer shot) {
        this.shot = shot;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.3).multiply(BigDecimal.valueOf(shot));
    }

    @Override
    public void prepare() {
        var name = getClass().getSimpleName().toLowerCase();
        System.out.println("Preparing " + name + " ...");
        System.out.println("Cost is : " + cost());
    }

}
