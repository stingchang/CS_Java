/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    // create an object containing (num, index)
    // during creation phase, check if (target-num) can be found

    var map = {};
    for(var i = 0; i< nums.length; i++){
        var n = target - nums[i];
        if(n in map){
            return [map[n], i];
        }
        map[nums[i]] = i;
    }
    return null;
};