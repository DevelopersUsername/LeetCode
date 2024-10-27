import java.util.Arrays;

class CustomStack {

    private int pos;
    private final int[] stack;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        Arrays.fill(stack, -1);
        this.pos = 0;
    }

    public void push(int x) {
        if (pos < stack.length)
            stack[pos++] = x;
    }

    public int pop() {

        if (--pos < 0) {
            pos = 0;
            return -1;
        }

        int value = stack[pos];
        stack[pos] = -1;

        return value;
    }

    public void increment(int k, int val) {

        for (int i = 0; i < stack.length && k > 0; i++, k--)
            stack[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */