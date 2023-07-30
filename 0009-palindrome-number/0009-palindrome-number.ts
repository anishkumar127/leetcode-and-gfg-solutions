function isPalindrome(x: number): boolean {
  const rev = String(x).split("").reverse().join("");
    console.log(rev);
  return x === Number(rev);
}
