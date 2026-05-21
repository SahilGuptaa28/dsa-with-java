import java.util.ArrayList;

class MinHeap {

    ArrayList<Integer> heap;

    MinHeap() {
        heap = new ArrayList<>();
    }

    // Parent
    int parent(int i) {
        return (i - 1) / 2;
    }

    // Left Child
    int left(int i) {
        return 2 * i + 1;
    }

    // Right Child
    int right(int i) {
        return 2 * i + 2;
    }

    // Swap
    void swap(int i, int j) {

        int temp = heap.get(i);

        heap.set(i, heap.get(j));

        heap.set(j, temp);
    }

    // =====================
    // UPHEAP
    // =====================

    void upHeap(int i) {

        while (i > 0 &&
               heap.get(i) < heap.get(parent(i))) {

            swap(i, parent(i));

            i = parent(i);
        }
    }

    // =====================
    // DOWNHEAP
    // =====================

    void downHeap(int i) {

        int smallest = i;

        int left = left(i);
        int right = right(i);

        if (left < heap.size() &&
            heap.get(left) < heap.get(smallest)) {

            smallest = left;
        }

        if (right < heap.size() &&
            heap.get(right) < heap.get(smallest)) {

            smallest = right;
        }

        if (smallest != i) {

            swap(i, smallest);

            downHeap(smallest);
        }
    }

    // =====================
    // INSERT
    // =====================

    void insert(int val) {

        heap.add(val);

        upHeap(heap.size() - 1);
    }

    // =====================
    // DELETE MIN
    // =====================

    int delete() {

        if (heap.size() == 0) {
            return -1;
        }

        int min = heap.get(0);

        // Move last element to root
        heap.set(0, heap.get(heap.size() - 1));

        // Remove last
        heap.remove(heap.size() - 1);

        // Fix heap
        downHeap(0);

        return min;
    }

    // Peek
    int peek() {

        if (heap.size() == 0) {
            return -1;
        }

        return heap.get(0);
    }

    // Print Heap
    void printHeap() {

        for (int i : heap) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}