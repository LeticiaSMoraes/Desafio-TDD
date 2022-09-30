import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoGameTest {

    VideoGame v1, v2, v3;

    @Before
    public void setup(){
        v1 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        v2 = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
    }


    @Test
    public void deveCalcularImpostoParaVideoGameUsado(){
        assertEquals(250.0, v2.calculaImposto(), 0.0001);
    }

    @Test
    public void deveCalcularImpostoParaVideoGameNovo(){
        assertEquals(810.0, v1.calculaImposto(), 0.0001);
    }

}
