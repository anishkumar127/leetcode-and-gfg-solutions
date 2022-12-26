class MyQueue {
public:
stack<int> a;
    MyQueue() {
        
    }
    void push(int x) {
        a.push(x);
    }
    
    int pop() {
        if(a.size()==1){
            int ans = a.top();
            a.pop();
            return ans;
        }
        int x = a.top();
        a.pop();
        int ans = pop();
        a.push(x);
        return ans;
    }
    
    int peek() {
        if(a.size()==1){
            int ans = a.top();
            return ans;
        }
        int x = a.top();
        a.pop();
        int ans = peek();
        a.push(x);
        return ans;
    }
    
    bool empty() {
        return a.size()==0;
    }

};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */