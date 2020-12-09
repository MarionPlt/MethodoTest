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
    private ArrayList listeTest = new ArrayList();

    @BeforeEach
    public void init() {

        this.test = new Vetement();
        this.test2 = new Chemise();
    }

    @Test
    public void testCouleur() {
        assertTrue(test2.type instanceof String);
    }

    @Test
    public void testStock() {
        assertNotNull(test2.stock);
    }
    @Test
    public void testPrix() {
        assertNotNull(test2.prix);
    }


     // Tests fonctionnels
     @Test
     public void testInteAjouter() {
         Vetement chemise = new Vetement();
         Vetement.ajouter(listeTest, chemise);
         assertNotNull( listeTest);
     }




     //Tests intégration
     @Test
     public void testFoncAjouter() {
         Chemise chemise = new Chemise();
         ArrayList commandeTest = new ArrayList<Vetement>();
         Vetement.ajouter(commandeTest, chemise);
         assertTrue((commandeTest.size() < listeTest.size()));
}
}



