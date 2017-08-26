/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function(root) {
    if(root === null) return true;

    var l1 = [],
        l2 = [];
    l1.push(root);
    while(l1.length > 0){
        var i = 0, j = l1.length-1;
        while(i<j){
            // null && null
            if((l1[i] !== null && l1[j] === null) ||
                (l1[i] === null && l1[j] !== null) ||
                (l1[i] !== null && l1[j] !== null && l1[i].val !== l1[j].val) ){
                return false;
            }
            i++;
            j--;
        }
        i = 0, j = l1.length-1;
        while(i<=j){
            if(l1[i]!==null){
                l2.push(l1[i].left);
                l2.push(l1[i].right);
            }
            i++;
        }
        l1 = l2.slice();
        l2 = [];
    }
    return true;
};