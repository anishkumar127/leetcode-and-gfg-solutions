//{ Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let input_line = readLine().split(' ');
        let a = input_line[0];
        let b = input_line[1];
        let obj = new Solution();
        if(obj.isAnagram(a, b))
            console.log("YES");
        else
            console.log("NO");
    }
}

// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} a
 * @param {string} b
 * @returns {boolean}
*/
 
class Solution 
{
    //Function is to check whether two strings are anagram of each other or not.
    isAnagram(a, b)
    {
        return a.split("").sort().join("") === b.split("").sort().join("");
    }
}