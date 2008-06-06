package no.tstsolutions.tvedere.domain.value;

/**
 *
 * @author asm
 */
public class Weight {
    private Integer value;
    
    private WeightUnit weightUnit = WeightUnit.G;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }
}
