package no.tstsolutions.tvedere.domain.persistent;

import java.util.Set;
import no.tstsolutions.tvedere.domain.value.Amount;
import no.tstsolutions.tvedere.domain.value.PackageSize;
import no.tstsolutions.tvedere.domain.value.Weight;

/**
 * Persistent domain class for the Product entity
 * @author anders.smestad
 */
public class Product extends PersistentObject {

    private Amount price;
    private Set<Image> images;
    private Integer inventoryCount;
    private String productNumber;
    private Boolean online;
    private String shortDescription;
    private String longDescription;
    private Weight weight;
    private PackageSize packageSize;
    private Brand brand;
    private Set<Product> variations;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Integer getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public PackageSize getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }

    public Amount getPrice() {
        return price;
    }

    public void setPrice(Amount price) {
        this.price = price;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Set<Product> getVariations() {
        return variations;
    }

    public void setVariations(Set<Product> variations) {
        this.variations = variations;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
