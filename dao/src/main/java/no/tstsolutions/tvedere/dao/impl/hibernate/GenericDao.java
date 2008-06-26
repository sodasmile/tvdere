package no.tstsolutions.tvedere.dao.impl.hibernate;

import java.util.List;
import no.tstsolutions.tvedere.domain.persistent.PersistentObject;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @param <T> Optional type the dao works on.
 * @author asm
 */
public class GenericDao<T extends PersistentObject> extends HibernateDaoSupport implements no.tstsolutions.tvedere.dao.GenericDao<T> {

    @Override
    public void save(T persistentObject) {
        getHibernateTemplate().save(persistentObject);
    }

    @Override
    public List<T> find() {
        return null;
    }

    @Override
    public T get(Long id) {
        return null;
    }
}
