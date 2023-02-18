/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let dummy = null;
    while(head!==null){
        let next = head.next;
        head.next = dummy;
        dummy= head;
        head = next;
    }
    return dummy;
};