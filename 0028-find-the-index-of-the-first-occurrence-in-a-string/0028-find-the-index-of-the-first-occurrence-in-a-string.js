/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    const ans = haystack.match(needle);
    return ans ? ans.index : -1;
};
