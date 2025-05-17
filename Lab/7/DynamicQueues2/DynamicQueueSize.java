package DynamicQueues2;

public class DynamicQueueSize extends DynamicQueueMax {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean empty() {
        return size == 0;
    }
}
