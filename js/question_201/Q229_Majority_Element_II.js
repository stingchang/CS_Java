/**
 * @param {number[]} nums
 * @return {number[]}
 */
var majorityElement = function(nums) {
    var n1,
        time1 = 0,
        n2,
        time2 = 0,
        len = nums.length;
    sol = [];

    for(var i = 0; i< len; i++){
        var c = nums[i];

        if(c == n1) {
            time1++;
        } else if(c == n2) {
            time2++;
        } else if(time1 == 0) {
            n1 = c;
            time1 = 1;
        } else if(time2 == 0) {
            n2 = c;
            time2 = 1;
        } else {
            time1--;
            time2--;
        }
    }

    // found 2 candidates, iterate through to check if they appear more than 1/3 times
    time1 = time2 = 0;
    for(var i = 0;i<len;i++){
        if(nums[i] == n1)
            time1++;
        if(nums[i] == n2)
            time2++;
    }
    if(time1 > len/3)
        sol.push(n1);
    if(time2 > len/3)
        sol.push(n2);

    return sol;
};