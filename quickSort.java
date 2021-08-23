class Solution{
    puclic int[] sortArray(int[] nums){
        quickSort(nums,0,nums.length - 1);
        return nums;
  }
  
  public static void quickSort(int[] arr,int left;int right){
      if(left >= right){
          return;
      }
      int l = left, r = right,pivot = arr[l];
      while(l < r){
          while(l < r && arr[r] >= pivot){
              r--;
          } 
          if(l < r){
              arr[l] = arr[r];
          } 
          while(l < r && arr[l] < temp){
              l++;
          }
          if(l < r){
              arr[r] = arr[l];
          }
      }
      arr[l] = pivot;
      quickSort(arr,left,l);
      quickSort(arr,l + 1, right);    
  }
}
