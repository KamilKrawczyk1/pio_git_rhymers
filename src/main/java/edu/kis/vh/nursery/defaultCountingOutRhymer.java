package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return getTotal() == -1;
    }

    public boolean isFull() {
        return getTotal() == 11;
    }

    protected int Peekaboo() {
        if (callCheck())
            return -1;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
