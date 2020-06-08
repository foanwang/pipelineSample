

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PipeTest {
    private Pipe pipe =new Pipe();
    @BeforeEach
    void init() {
        pipe =new Pipe();
    }
    @Test
    void  Increment() throws ClassNotFoundException {
        Integer result = pipe.pipe(5);
        assertEquals(new Integer(6), result);
    }

    @Test
    void IncrementWithFunctionPointer() throws ClassNotFoundException {
        Integer result = pipe.pipe(5,"increment", "increment");
        assertEquals(new Integer(8), result);
    }

    @Test
    void IncrementWithNullFunctionPointer() throws ClassNotFoundException {
           String menthodname = "Test";
           Throwable exception = Assertions.assertThrows(NullPointerException.class, () -> {
               pipe.pipe(5,menthodname, menthodname);
           });
    }


    @AfterEach
    void tearDown() {
        pipe = null;
    }
}
