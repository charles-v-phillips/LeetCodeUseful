public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static String arrToString(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + ", ";

        }
        return s;

    }

    //solely for the purpose of debugging. Allows me to take the
    // array rep that leetcode gives me and turn it into a BST for debugging
    public static TreeNode validArrayToBST(Integer[] arr, int i){
        if(i >= arr.length) return null;
        TreeNode head = new TreeNode(arr[i]);
        head.left = validArrayToBST(arr,(i+1)*2-1);
        head.right = validArrayToBST(arr,(i+1)*2);

        return head;}

    public static TreeNode validArrayToBST(Integer[] arr){
        return validArrayToBST(arr,0);
    }

    public static void main(String[] args) {

    }
}
