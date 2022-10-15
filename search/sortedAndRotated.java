
/*
 * Search an element in sorted and rotated array
 * 
 *     Given a sorted and rotated array A of N distinct elements which are rotated at
 *     some point, and given an element K. The task is to find the index of the given 
 *     element K in array A.

Example 1:

Input:
N = 9
A[] = {5,6,7,8,9,10,1,2,3}
K = 10
Output: 5
Explanation: 10 is found at index 5.
Example 1:

Input:
N = 3
A[] = {3,1,2}
K = 1
Output: 1
User Task:
Complete Search() function and return the index of the element K if found in the array. If the element is not present, then return -1.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
 */
package search;

public class sortedAndRotated {
    static int Search(int arr[], int target)
	{
	    // code here
	    
	    int start=0;
	    int end=arr.length-1;
	    
	    while(start<end)
	    {
	        int mid=(start+end)/2;
	        
	        if(target==arr[mid])
	        return mid;
	        if(target==arr[start])
	        return start;
	        if(target==arr[end])
	        return end;
	        
	       if(arr[start]<arr[mid])
	       {
	           if(target>=arr[start]&&target<arr[mid])
	           {
	               end=mid;
	           }
	           else
	           {
	               
	               start=mid+1;
	               
	           }
	           
	       }else
	       {
	           if(target>arr[mid]&&target<=arr[end])
	           {
	               start=mid+1;
	              
	           }else
	           {
	               end=mid;
	              
	           }
	           
	       }
	        
	    }
	    
	   return -1;
	}
}
