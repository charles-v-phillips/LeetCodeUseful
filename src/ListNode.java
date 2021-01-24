public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public String toString(){
        String s = "";
        ListNode dummy = this;
        while(dummy != null){
            s = s + dummy.val  +"->";
            dummy = dummy.next;

        }
        s = s+ "null";
        return s;
    }
}
