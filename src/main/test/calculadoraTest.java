
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



/**
 * The test class BackkingBeanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
class BackkingBeanTest
{
    /**
     * Default constructor for test class BackkingBeanTest
     */
    public BackkingBeanTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void deberiaCalcularLaElPromedio() {
        BackkingBean test = new BackkingBean();
        double lista[] = new double[]{1.2, 5.6, 3.4, 2.9, 9.7};
        test.caculateMean(lista);
        double res = test.getMedia();
        assertEquals(4.56, res);
    }
    @Test
    public void deberiaCalcularcalculateStandardDeviation() {
        BackkingBean test = new BackkingBean();
        double lista[] = new double[]{1.2, 5.6, 3.4, 2.9, 9.7};
        test.calculateStandardDeviation(lista);
        double res = test.getDesviacion();
        assertEquals(10.19646997739904, res);
    }
    @Test
    public void deberiaCalcularcalculateVariance() {
        BackkingBean test = new BackkingBean();
        double lista[] = new double[]{1.2, 5.6, 3.4, 2.9, 9.7};
        test.calculateVariance(lista);
        double res = test.getVarianza();
        assertEquals(29.371999999999996, res);
    }
    @Test
    public void deberiaCalcularcalcalculateMode() {
        BackkingBean test = new BackkingBean();
        double lista[] = new double[]{1.2, 5.6, 3.4, 2.9, 9.7};
        test.calculateMode(lista);
        double res = test.getModa();
        assertEquals(9.7, res);
    }
    @Test
    public void deberiarestart() {
        BackkingBean test = new BackkingBean();
        double lista[] = new double[]{1.2, 5.6, 3.4, 2.9, 9.7};
        test.restart();
        double res[] = test.getV();
        assertEquals(null, res);
    }



    








}

