package JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void TestStack() {
        Stack stack = new Stack();
        stack.push("Zeynep");
        assertEquals("Zeynep", stack.pop());

    }
}
