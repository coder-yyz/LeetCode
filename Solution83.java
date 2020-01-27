class Solution83 {
       public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
    //使用递归

    public ListNode deleteDuplicates(ListNode head) {
           //链表为空或者只有一个节点时，直接返回头节点
        if (head == null || head.next == null){
            return head;
        }
        //递归
        head.next= deleteDuplicates(head.next);
        //判断是否为重复元素，如果是，删除该节点
        if (head.val == head.next.val)
            head = head.next;
        return head;
    }
}