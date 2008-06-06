package no.tstsolutions.tvedere.domain.persistent;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Abstract superclass for persistent objects.
 * Contains common properties and functionality for
 * all persistent domain objects.
 * @author asm
 */
@MappedSuperclass
public abstract class PersistentObject implements Serializable {

    /**
     * Orm id. Should not be used for business logic
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
    
    /**
     * Name of persistent object
     */
    @Column(nullable = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
