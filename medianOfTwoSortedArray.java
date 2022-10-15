/* Median of 2 Sorted Arrays of Different Sizes
 * Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.
 * 
 * Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
 */

public class medianOfTwoSortedArray {

    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int flag=(n+m)%2;
        
        int mid=(m+n)/2;
        
        int cnt=0;
        int prev=-1;
        int i=0;
        int j=0;
        int cur=0;
        while(cnt<=mid)
        {
            prev=cur;
            if(i<n&&j<m)
            {
                
                if(a[i]<b[j])
                {
                   cur=a[i];
                   cnt++;
                   i++;
                }else
                {
                    cur=b[j];
                    j++;
                    cnt++;
                }
            }else if(i<n)
            {
                cur=a[i];
                i++;
                cnt++;
            }else
            {
                cur=b[j];
                j++;
                cnt++;
            }
        }
        
        if(flag==0)
        {
            return (double)(prev+cur)/2;
        }
        
        return cur;
        
    }
}
