package no.tstsolutions.tvedere.domain.persistent;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Represents a product category
 * @author asm
 */
@Entity
public class Category extends PersistentObject {

    private Boolean online;
    private Category parentCategory;
    @OneToMany
    private Set<Product> products;

    public Boolean getOnline() {
        return online;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
