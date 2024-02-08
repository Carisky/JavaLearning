package src.Homework5.Task6;

class Array implements IMath {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int max() {
        int max = elements[0];
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = elements[0];
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public float avg() {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return (float) sum / elements.length;
    }
}
