package no.tstsolutions.tvedere.dao;

import java.util.List;
import no.tstsolutions.tvedere.domain.persistent.PersistentObject;

/**
 * General Data Access Object for storing and retrieving persistent objects.
 * @param <T> Optionally specifying type the dao should operate on.
 * @author asm
 */
public interface GenericDao<T extends PersistentObject> {
    
    /**
     * Saves a persitable object in data store
     * @param persistentObject
     */
    void save(T persistentObject);
    
    /**
     * 
     * @param type
     * @return
     */
    List<T> find(); // TODO: Should you need to pass in the type here?
    
    /**
     * Retrieves a persistent object from data store.
     * @param id
     * @return
     */
    T get(Long id);
}
