class RecentCounter {
     Queue<Integer> queue;

    public RecentCounter() {
         queue= new LinkedList();
        
    }
    
    public int ping(int t) {
        int range = t-3000;
        while(!queue.isEmpty() && queue.peek() < range ){
            queue.poll();
        }
        queue.offer(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
