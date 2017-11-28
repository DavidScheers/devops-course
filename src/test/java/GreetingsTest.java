import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class GreetingsTest {
    @Test
    public void greeting1() throws Exception {
    }

    public static final String DAVID = "David";
    private Greetings greetings;

    @Before
    public void setUp() throws Exception {
        greetings = new Greetings();
    }

    @Test
    public void greeting() throws Exception {
        String actual = greetings.greeting(DAVID);

        Assertions.assertThat(actual).isEqualTo("Hello David!");
    }

}