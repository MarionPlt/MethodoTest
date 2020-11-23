import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;


public class TestAffichage extends TestCase {
    /*
     * Tests unitaires
     * */
    private Vetement test;
    private Chemise test2;

    @BeforeEach
    public void init() {

        this.test = new Vetement();
        this.test2 = new Chemise();
    }

    @Test
    public void testType() {
        assertTrue(test.type instanceof String);
    }

    @Test
    public void testStock() {
        assertNotNull(test.stock);
    }

    @Test
    public void testAjouter() {
        assertTrue(Commande.ajouter(test) instanceof ArrayList);
    }


    /*
     * Tests fonctionnels
     * */
    @Test
    public void testFoncAjouter() {
        Chemise chemise = new Chemise();
        ArrayList commandeTest = new ArrayList<Vetement>();
        ArrayList commandeTest2 = Commande.ajouter(chemise);
        assertTrue((commandeTest.size() < commandeTest2.size()));

    }
    /*
     * Tests intégration
     */


}
