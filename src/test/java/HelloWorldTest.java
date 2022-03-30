import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    void hello() {
        assertEquals(helloWorld.hello(), "Hello");
    }
}
