class ArrayQueue {
    private int[] values;
    private int front;
    private int size;

    public ArrayQueue() {
        values = new int[4];
        front = 0;
        size = 0;
    }

    public void push(int x) {
        if (size == values.length) {
            int[] expanded = new int[values.length * 2];

            for (int i = 0; i < size; i++) {
                expanded[i] = values[(front + i) % values.length];
            }

            values = expanded;
            front = 0;
        }

        int back = (front + size) % values.length;
        values[back] = x;
        size++;
    }

    public int pop() {
        int answer = values[front];
        front = (front + 1) % values.length;
        size--;
        return answer;
    }

    public int peek() {
        return values[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}