function findKthLargest(nums: number[], k: number): number {
  const pq = new MinPriorityQueue();
  for (const value of nums) {
    pq.enqueue(value);
    if (pq.size() > k) {
      pq.dequeue();
    }
  }
  // console.log(pq.front().element);
  return pq.front().element;
}
