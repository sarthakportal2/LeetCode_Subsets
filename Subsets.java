import java.util.ArrayList;
class Solution {
  //Approches(1)
    public void backtrack(List<List<Integer>> list , List<Integer> tmpList, int [] nums, int start){
    list.add(new ArrayList<>(tmpList));
    for(int i = start; i < nums.length; i++){
        tmpList.add(nums[i]);
        backtrack(list, tmpList, nums, i + 1);
        tmpList.remove(tmpList.size() - 1);}}

    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;}}

   // public void Backtrack(List<List<Integer>>l1,List<Integer> tmpList,int [] nums,int begin){
    //     l1.add(new ArrayList<Integer>(tmpList));
    //     for(int i=begin;i<nums.length;i++){
    //         Backtrack(l1,tmpList,nums,i+1);
    //         tmpList.remove(tmpList.size()-1);}}

    // public List<List<Integer>>subsets(int[] nums) {
    //     List<List<Integer>> l1=new ArrayList<>();
    //     Arrays.sort(nums);
    //     Backtrack(l1,tmpList,nums,begin);
    //     return l1;}}
