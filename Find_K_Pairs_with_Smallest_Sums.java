import java.util.LinkedList;
import java.util.List;

/**
 * Created by adventure on 16/7/7.
 */
public class Find_K_Pairs_with_Smallest_Sums {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result=new LinkedList<>();
        if(nums1.length==0||nums2.length==0){
            return result;
        }
        int heapSize=0;
        Node[] heap=new Node[k];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                Node node=new Node(nums1[i],nums2[j],nums1[i]+nums2[j]);
                if(heapSize<k){
                    heap[heapSize++]=node;
                    if(heapSize==k){
                        buildHeap(heap);
                    }
                }else {
                    if(nums1[i]+nums2[j]<heap[0].sum){
                        node=new Node(nums1[i],nums2[j],nums1[i]+nums2[j]);
                        modifyHeap(heap,node,0);
                    }else {
                        break;
                    }
                }
            }
        }
       // System.out.println(heapSize);
        for(int i=0;i<heapSize;i++){
            int[] temp=new int[2];
            temp[0]=heap[i].u;
            temp[1]=heap[i].v;
            result.add(temp);
        }
        return result;
    }

    private void buildHeap(Node[] heap){
        int length=heap.length;
        int p=(length-2)/2;
     //   System.out.println(p);
        for(int index=p;index>=0;index--){
            int k=index*2+1;
            if(index*2+2<heap.length&&heap[index*2+2].sum>heap[k].sum){
                k=index*2+2;
            }
     //       System.out.println(k);
            if(heap[k].sum>heap[index].sum){
                Node  temp=heap[k];
                heap[k]=heap[index];
                heap[index]=temp;
                modifyHeap(heap,heap[k],k);
            }
        }
    }



    private void modifyHeap(Node[] heap,Node node,int index){
        heap[index]=node;
        while (index*2+1<heap.length){
            int k=index*2+1;
            if(index*2+2<heap.length&&heap[index*2+2].sum>heap[k].sum){
                k=index*2+2;
            }
            if(heap[k].sum>heap[index].sum){
                Node temp=heap[k];
                heap[k]=heap[index];
                heap[index]=temp;
                index=k;
            }else {
                break;
            }
        }

    }

    class Node{
        int u;
        int v;
        int sum;
        public Node(int u, int v,int sum) {
            this.u = u;
            this.v = v;
            this.sum=sum;
        }
    }

    public static void main(String[] args) {
        Find_K_Pairs_with_Smallest_Sums test=new Find_K_Pairs_with_Smallest_Sums();
        int[] u= {0,0,0,0,0,2,2,2,2};
        int[] v= {-3,22,35,56,76};
        List<int[]> result=test.kSmallestPairs(u,v,22);
        for(int[] temp:result){
            System.out.println(temp[0]+"  "+temp[1]);
        }
//        [0,0,0,0,0,2,2,2,2]
//        [-3,22,35,56,76]
//        22

    }
}
