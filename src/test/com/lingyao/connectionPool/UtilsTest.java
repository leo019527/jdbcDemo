package test.com.lingyao.connectionPool;

import com.lingyao.connectionPool.Utils;
import com.lingyao.Person;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * Utils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>06/22/2018</pre>
 */
public class UtilsTest extends TestCase {
    private int a;

    public UtilsTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: add(Person p)
     */
    @org.junit.Test
    public void testAdd() throws Exception {
        Person person = new Person("name2", "123");
        Utils utils = new Utils();
        utils.add(person);
    }

    /**
     * Method: delete(Person p)
     */
    @org.junit.Test
    public void testDelete() throws Exception {
        Person person = new Person("name0", "123");
        new Utils().delete(person);
    }

    /**
     * Method: update(Person p, String psw)
     */
    @org.junit.Test
    public void testUpdate() throws Exception {
        Person person = new Person("name1", "123");
        new Utils().update(person, "234");
    }

    /**
     * Method: select(String name)
     */
    @org.junit.Test
    public void testSelect() throws Exception {
        new Utils().select("name0");
    }


    public static Test suite() {
        return new TestSuite(UtilsTest.class);
    }
} 
