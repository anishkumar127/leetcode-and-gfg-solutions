function findKthLargest(nums: number[], k: number): number {
  const pq = new MinPriorityQueue();
  for (const value of nums) pq.enqueue(value), pq.size() > k && pq.dequeue();
  
  return pq.front().element;
}
