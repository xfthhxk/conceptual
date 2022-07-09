package conceptual.core;

import org.cojen.util.BeanComparator;

import java.util.Comparator;

/**
 * A basic tuple for sorting keys by frequency.
 */
public class KeyFrequencyPair {
    public int key;
    public int frequency;

    public static final Comparator<KeyFrequencyPair> KeyFrequencyPairComparator =
            BeanComparator.forClass(KeyFrequencyPair.class).orderBy("-frequency");

    public KeyFrequencyPair(int key, int frequency) {
        this.key = key;
        this.frequency = frequency;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyFrequencyPair that = (KeyFrequencyPair) o;

        if (frequency != that.frequency) return false;
        if (key != that.key) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key;
        result = 31 * result + frequency;
        return result;
    }

    @Override
    public String toString() {
        return "[" + key + " " + frequency + ']';
    }
}
