class Solution{
  private int[] arr;
  private int[] initialNums;
  public Solution(int[] nums){
    this.arr = nums;
    this.initialNums = Array.copyOf(nums,nums.length);
  }    

  //Resets the array to its original configuration and return it
  public int[] reset(){
    return initialNums;
  }
  
  //Returns a random shuffling of the array
  puclic int[] shuffle(){
    Random rand = new Random();
    for(int i = arr.length-1; i>=0; i--){
      int temp = arr[i];
      int j = rand.nextInt(i+1);
      arr[i] = arr[j];
      arr[j] = temp;  
    }
    return arrr;
  }
}


