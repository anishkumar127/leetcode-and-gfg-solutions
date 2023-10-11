/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function (grid) {
  let arr = grid.flat(101);

  const count = arr.reduce((curr, next) => {
    if (next < 0) {
      return curr + 1;
    } else {
      return curr;
    }
  }, 0);
  return count;
};
