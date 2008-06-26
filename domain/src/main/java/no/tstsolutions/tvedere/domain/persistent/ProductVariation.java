package no.tstsolutions.tvedere.domain.persistent;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author asm
 */
@Entity
public class ProductVariation extends Product {

    private Product parent;
    @ManyToMany
    private Set<Variation> variation; // ?? How to do this best?? Should product variation be a child object product? TODO: 
    //Should this be moved to extended product variation?

    public Product getParent() {
        return parent;
    }

    public void setParent(Product parent) {
        this.parent = parent;
    }

    public Set<Variation> getVariation() {
        return variation;
    }

    public void setVariation(Set<Variation> variation) {
        this.variation = variation;
    }
}
