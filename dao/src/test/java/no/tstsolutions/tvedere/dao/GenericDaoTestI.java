package no.tstsolutions.tvedere.dao;

import no.tstsolutions.tvedere.domain.persistent.Brand;
import no.tstsolutions.tvedere.domain.persistent.Product;
import no.tstsolutions.tvedere.domain.persistent.Variation;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author asm
 */
@ContextConfiguration(locations = {"classpath:appContext-dao-test.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class GenericDaoTestI extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    @Qualifier("genericDao")
    private GenericDao genericDao;

    @SuppressWarnings("unchecked")
    @BeforeTransaction
    public void setUpIntegrationTest() throws Exception {
        /*
         * PersistentObject o = new PersistentObject(...);
         * genericDao.save(o);
         */
    }

    public void setGenericDao(GenericDao genericDao) {
        this.genericDao = genericDao;
    }

    @Test
    public void testCreateObject() {
        Variation v = new Variation();
        genericDao.save(v);
        assertNotNull("Expecting id set after saving", v.getId());
    }
    
    @Test 
    public void testProduct() {
        Brand b = newBrand("TestBrand");
        Product p = newProduct(b);
        assertNotNull(p.getId());
    }
    
    private Product newProduct(Brand b) {
        Product p = new Product();
        p.setBrand(b);
        genericDao.save(p);
        return p;
    }
    
    private Brand newBrand(String name) {
        Brand b = new Brand();
        b.setName(name);
        genericDao.save(b);
        return b;
    }
}
