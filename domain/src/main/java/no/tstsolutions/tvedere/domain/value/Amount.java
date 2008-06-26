package no.tstsolutions.tvedere.domain.value;

import java.math.BigDecimal;
import javax.persistence.Embedded;

/**
 * Represents an amount
 * @author asm
 */
public class Amount {
    // TODO: Is it smart to use big decimal here??
    // Will never use more than two decimals
    // Pluss the problem with the fixed number of value holders...
    private BigDecimal amount;    // Is it right that an amount has currency??
    @Embedded
    private Currency currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
