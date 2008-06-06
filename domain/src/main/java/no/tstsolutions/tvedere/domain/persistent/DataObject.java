package no.tstsolutions.tvedere.domain.persistent;

/**
 * Abstract class with common properties for data objects to 
 * be persisted.
 * @author asm
 */
public abstract class DataObject extends PersistentObject {

    // TODO: Is this a good way to represent data??
    private byte[] data;

    /**
     * Returns the MIME type for data object
     * @return String with mime type
     */
    public abstract String getMIMEType();
    
    /**
     * Returns the binary data for this data object
     * @return
     */
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
