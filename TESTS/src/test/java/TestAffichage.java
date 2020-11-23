import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestAffichage extends TestCase {

    @Test
    public void testType(){
        Vetement chemise = new Vetement("chemise");
        assertEquals("chemise", chemise.getType());
    }

    @Test
    public void testCouleur(){
        Vetement chemise = new Vetement("Chemise", "bleu");
        assertEquals("chemise", chemise.getCouleur());
    }

}
