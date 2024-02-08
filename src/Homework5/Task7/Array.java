package src.Homework5.Task7;

class Array implements ISort {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void sortAsc() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sortDesc() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] < elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
