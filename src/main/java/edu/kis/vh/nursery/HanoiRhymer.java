package edu.kis.vh.nursery;

/**
 * Klasa rozszerza defaultCountingOutRhymer.
 * Dodaje licznik elementów, które zostały odrzucone.
 */
public class HanoiRhymer extends defaultCountingOutRhymer {

    /**
     * Liczba odrzuconych elementów
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych elementów.
     *
     * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje element, jeśli spełnia warunki.
     * Jeśli nie – zwiększa licznik odrzuceń.
     *
     * @param in element do dodania
     */
    public void countIn(int in) {
        if (!callCheck() && in > Peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
