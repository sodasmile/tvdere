package no.tstsolutions.tvedere.domain.persistent;

import javax.persistence.Entity;

/**
 * Represents a brand. Products usually have a brand
 * @author asm
 */
@Entity
public class Brand extends PersistentObject {
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
