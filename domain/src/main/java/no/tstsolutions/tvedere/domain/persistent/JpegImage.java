package no.tstsolutions.tvedere.domain.persistent;

import javax.persistence.Entity;

/**
 * Represents a persistent Jpeg image
 * @author asm
 */
@Entity
public class JpegImage extends Image {
    
    private static final String MIME_TYPE = "image/jpeg";

    @Override
    public int getHeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getWidth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getMIMEType() {
        return MIME_TYPE;
    }

}
