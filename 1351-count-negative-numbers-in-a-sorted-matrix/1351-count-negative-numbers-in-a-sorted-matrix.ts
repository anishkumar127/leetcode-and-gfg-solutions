function countNegatives(grid: number[][]): number {
  const arr: number[] = grid.flat();

  const count: number = arr.reduce((curr: number, next: number) => {
    if (next < 0) {
      return curr + 1;
    } else {
      return curr;
    }
  }, 0);
  return count;
}

