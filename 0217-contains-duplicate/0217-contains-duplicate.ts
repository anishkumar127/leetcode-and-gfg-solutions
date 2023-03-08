function containsDuplicate(nums: number[]): boolean {
    const lookup = new Set();
    for(let value of nums) 
     if(lookup.has(value)) return true;
    else
     lookup.add(value);
    
    return false;
};