public class CircularBuffer {
    private int bufferSize = 10; // 1.1
    private final String[] buffer;
    private int readPointer;
    private int writePointer;

    // Default constructor
    public CircularBuffer() {
        this(10);
    }
    // Overload constructor
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize]; // 1.2
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return writePointer >= bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
