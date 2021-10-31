package patterns.composition.domain.condiment;

import java.math.BigDecimal;

public interface Condiment {
    BigDecimal cost();

    void prepare();
}
