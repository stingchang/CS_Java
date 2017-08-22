/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    // because it appears more than n/2 time, we simply track how many "current" num
    var cur = "",
        times = 0;
    for(var i = 0; i< nums.length; i++){
        if(cur == nums[i]){
            times++;
        }

        else if(times==0) {
            cur = nums[i];
            times = 1;
        } else {
            times--;
        }
    }

    return cur;
};