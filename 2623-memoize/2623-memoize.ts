type Fn = (...params: any) => any

function memoize(fn: Fn): Fn {
    const dp = {};
    return function(...args) {
        const key = JSON.stringify(args); // indivisual 2 ,3 , 5 like that convert to string.
        if(key in dp){
            return dp[key];
        }
        return dp[key] = fn(...args);
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */