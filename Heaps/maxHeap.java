import java.util.ArrayList;

class MaxHeap {

    ArrayList<Integer> heap;

    MaxHeap() {
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
    // UPHEAP  
    void upHeap(int i) {

        while (i > 0 &&
               heap.get(i) > heap.get(parent(i))) {

            swap(i, parent(i));

            i = parent(i);
        }
    }

    // =========================
    // DOWNHEAP
    // =========================

    void downHeap(int i) {

        int largest = i;

        int left = left(i);
        int right = right(i);

        if (left < heap.size() &&
            heap.get(left) > heap.get(largest)) {

            largest = left;
        }

        if (right < heap.size() &&
            heap.get(right) > heap.get(largest)) {

            largest = right;
        }

        if (largest != i) {

            swap(i, largest);

            downHeap(largest);
        }
    }

    // =========================
    // INSERT
    // =========================

    void insert(int val) {

        heap.add(val);

        upHeap(heap.size() - 1);
    }


    // DELETE MAX

    int delete() {

        if (heap.size() == 0) {
            return -1;
        }

        int max = heap.get(0);

        // Move last to root
        heap.set(0, heap.get(heap.size() - 1));

        // Remove last
        heap.remove(heap.size() - 1);

        // Fix heap
        downHeap(0);

        return max;
    }

    // Print
    void printHeap() {

        for (int i : heap) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
