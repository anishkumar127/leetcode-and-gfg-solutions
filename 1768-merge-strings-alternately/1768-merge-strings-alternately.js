/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    
    let str1 = word1.split("");

    let str2 = word2.split("");
    let ans ="";
    for(let i =0; i<str1.length || i< str2.length; i++){
        if(i<word1.length) ans+=str1[i];
        if(i<word2.length) ans+=str2[i];
    }
    // console.log(ans);
    return ans;
};