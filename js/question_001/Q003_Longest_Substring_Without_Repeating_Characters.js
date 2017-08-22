/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    // 2 pointers to track current unrepeated sub string
    // create an object to contains each character's last found location
    // if char is already in the object, move left pointer to current character's last location+1

    if(s=="" || s==null)
        return 0;

    var a = 0,
        b = 0,
        maxLength = 1;
    map = {};
    map[s.charAt(0)] = 0;

    for(var i = 1; i< s.length; i++){
        var curChar = s.charAt(i);
        if(curChar in map && map[curChar]>=a){
            a = map[curChar]+1;
        } else {
            b = i;
            maxLength = Math.max(b-a+1, maxLength);
            console.log(a+" "+b);
        }
        map[curChar] = i;
    }
    return maxLength;
};