package no.tstsolutions.tvedere.domain.persistent;

/**
 * Represents a brand. Products usually have a brand
 * @author asm
 */
public class Brand extends PersistentObject {
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
