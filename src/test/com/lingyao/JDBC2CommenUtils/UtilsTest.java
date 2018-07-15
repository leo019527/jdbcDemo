package test.com.lingyao.JDBC2CommenUtils;

import com.lingyao.JDBC2CommenUtils.Utils;
import com.lingyao.Person;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Utils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÁùÔÂ 22, 2018</pre>
 */
public class UtilsTest {
    private int a = 0;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(Person p)
     */
    @Test
    public void testAdd() throws Exception {
        Person person = new Person("name" + a, "123");
        a += 1;
        Utils utils = new Utils();
        utils.add(person);
    }

    /**
     * Method: delete(Person p)
     */
    @Test
    public void testDelete() throws Exception {
        Person person = new Person("name0", "123");
        new Utils().delete(person);
    }

    /**
     * Method: update(Person p, String psw)
     */
    @Test
    public void testUpdate() throws Exception {
        Person person = new Person("name0", "123");
        new Utils().update(person, "234");
    }

    /**
     * Method: select(String name)
     */
    @Test
    public void testSelect() throws Exception {
        new Utils().select("name0");
    }


} 
