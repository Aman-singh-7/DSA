package Sort;
/*
 *                 Quick Sort Algorithm
 *        
 */
public class quickSort {

    static void sort(int arr[],int l,int r)
    {
        if(l<r){
            int p=partation(arr, l, r);
            sort(arr, p+1,r);
            sort(arr, l, p-1);
        }
    }
    static int partation(int arr[],int l,int r)
    {
        int i=l;
        int pivot=arr[r];
        for(int j=l;j<r;j++)
        {
            if(arr[j]<=pivot)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
            }

        }
        int t=arr[i];
        arr[i]=arr[r];
        arr[r]=t;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={4,2,8,1,9,3,44,1};
        sort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    
}
