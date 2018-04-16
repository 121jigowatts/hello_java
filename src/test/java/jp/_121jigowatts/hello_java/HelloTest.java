package jp._121jigowatts.hello_java;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class HelloTest {
    @Test
    public void sayHello_add_World_return_Hello_World() {
        Hello target = new Hello();
        String expected = "Hello! World";
        String actual = target.sayHello("World");
        assertThat(actual, is(expected));
    }
}