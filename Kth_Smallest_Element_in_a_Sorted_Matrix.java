import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by adventure on 16/8/2.
 */
public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2-(Integer)o1;
            }
        });
        int length=matrix.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(queue.size()<k){
                    queue.add(matrix[i][j]);
                }else{
                    if(queue.peek()>matrix[i][j]){
                        queue.poll();
                        queue.add(matrix[i][j]);
                    }
                }
            }
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Kth_Smallest_Element_in_a_Sorted_Matrix test=new Kth_Smallest_Element_in_a_Sorted_Matrix();
        int[][] num={{ 1,  5,  9},
                {10, 11, 13},
                {12, 13, 15}};
        System.out.println(test.kthSmallest(num,8));
    }

}
