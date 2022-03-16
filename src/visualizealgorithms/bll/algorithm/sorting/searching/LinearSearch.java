package visualizealgorithms.bll.algorithm.sorting.searching;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class LinearSearch extends GenericAlgorithm {


    public LinearSearch() {
        super("Linear Search", "Simple O(N) Search function", AlgorithmType.SEARCHING);
    }

    @Override
    public void doWork() {

        int[] n = (int[]) super.getData(); //array with random numbers
        int wanted = n[n.length - 1]; //force the worst case
        //foreach, for, while loop
        for (int element : n) {
            if (element == wanted)
                break;
        }

    }
}
