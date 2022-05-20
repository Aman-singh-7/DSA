import java.util.Scanner;
public class heap
{
   static void heapify(int[] arr,int size,int index)
    {
        int swapIndex=index;
        int leftChild=2*index+1;
        int rightChild=2*index+2;
        if(leftChild<size&&arr[leftChild]>arr[swapIndex])
         swapIndex=leftChild;
        if(rightChild<size&&arr[rightChild]>arr[swapIndex])
        {
            swapIndex=rightChild;
        }
         if(swapIndex!=index)
        {
            
            int temp=arr[swapIndex];
            arr[swapIndex]=arr[index];
            arr[index]=temp;
            heapify(arr,size,swapIndex);

        }
        
    }
 static  void buildHeap(int [] arr,int size)
    {
        int lastNonLeaf=(size/2)-1;
        for(int i=lastNonLeaf;i>=0;i--)
        {
            heapify(arr,size,i);
        }

    }

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Size of heap:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the data:");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    buildHeap(arr,size);
    
    System.out.println("Heap Elements Are:");
    for(int i:arr)
    {
        System.out.println(i);
    }


}



}