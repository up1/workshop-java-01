import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    CircularBuffer cb = new CircularBuffer(); // 1

    @Test
    public void create_new_buffer_with_size() {
        cb = new CircularBuffer(5);
    }

    @Test
    public void create_new_buffer_should_empty() {
        boolean result = cb.isEmpty();
        assertTrue("Buffer ไม่ว่างนะ", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for(int i=0; i< 10; i++) { // 2
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer ไม่เต็มนะ", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer() {
        cb.writeData("A");
        cb.writeData("B");

        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }



}