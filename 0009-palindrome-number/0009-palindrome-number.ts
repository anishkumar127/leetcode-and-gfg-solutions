function isPalindrome(x: number): boolean {
 const strConverted = x.toString();
 let s = 0;
 let e = strConverted.length-1;
    while(s<=e){
        if(strConverted[s++]!== strConverted[e--]){
            return false;
        }
    }
    return true;
};