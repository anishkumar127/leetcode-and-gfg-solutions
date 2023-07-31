/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findKthLargest = function (nums, k) {
  const pq = new MinPriorityQueue();
  for (const x of nums) {
    pq.enqueue(x);
    if (pq.size() > k) {
      pq.dequeue();
    }
  }
  return pq.front().element;
};
