import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Leonel on 26/10/2015.
 */
public class TestMathBase {
    @Test
    public void TestSumaBasica(){

        MathBase sumador = new MathBase();
        int resultadoEsperado = 10;
        int resultadoObtenido = sumador.sumaBasica(7,3);

        assertEquals("Test suma", resultadoEsperado, resultadoObtenido);
        assertNotEquals("Suma malll",resultadoEsperado, resultadoObtenido);
    }
}
