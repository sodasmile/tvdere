package no.tstsolutions.tvedere.domain.persistent;

import javax.persistence.Entity;

/**
 * Representing an image
 * @author asm
 */
@Entity
public abstract class Image extends DataObject {
    
    private String caption;
    
    // TODO: Add some kind of thumbnail??

    /**
     * Returns height of image
     * @return
     */
    public abstract int getHeight();

    /**
     * Returns width of image
     * @return
     */
    public abstract int getWidth();

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
