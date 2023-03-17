public class IntegerRange implements Range {



    private int lower;

    private int upper;



    public IntegerRange(int lower, int upper) {

        this.lower = lower;

        this.upper = upper;

    }



    public int getLower() {

        return lower;

    }



    public int getUpper() {

        return upper;

    }



    public boolean contains(int value) {

        return value >= lower && value <= upper;

    }



    public boolean overlaps(Range other) throws EmptyRangeException {

        if (other == null) {

            throw new EmptyRangeException();

        }

        return this.contains(other.getLower()) || this.contains(other.getUpper()) ||

                other.contains(this.getLower()) || other.contains(this.getUpper());

    }



    public int size() {

        return upper - lower + 1;

    }



}







