/**
 * Definition for isBadVersion()
 * 
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        let s  =1;
        let e = n-1;
        while(s<=e){
            const mid = Math.floor(s+(e-s)/2);
            if(isBadVersion(mid)){
                e = mid -1;
            }else s = mid+1;
        }
        return s;
    };
};