import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class TestAffichage extends TestCase {
    /*
     * Tests unitaires
     * */
    @Test
    public void testType() {
        Vetement chemise = new Vetement("chemise");
        assertEquals("chemise", chemise.getType());
    }

    @Test
    public void testCouleur() {
        Vetement chemise = new Vetement("chemise", "bleue", 15.6f, 3);
        assertEquals("bleu", chemise.getCouleur());
    }

    @Test
    public void testprix() {
        Vetement chemise = new Vetement("chemise", "bleue", 15.6f, 3);
        assertEquals(15.5f, chemise.getPrix());
    }

    @Test
    public void testTaille() {
        Vetement chemise = new Vetement("chemise", "bleue", 15.6f, 3);
        assertEquals(3, chemise.getTaille());
    }
    @Test
    public void testAjouter() {
        Vetement chemise = new Vetement("chemise");
        assertTrue(Commande.ajouter(chemise) instanceof ArrayList);
    }


    /*
     * Tests fonctionnels
     * */
    @Test
    public void testFoncAjouter() {
        Vetement chemise = new Vetement("chemise");
        ArrayList commandeTest = new ArrayList<Vetement>();
        ArrayList commandeTest2 = Commande.ajouter(chemise);
        assertTrue((commandeTest.size() < commandeTest2.size()));

    }
}
