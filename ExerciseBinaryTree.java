


import java.util.ArrayList;

    public class ExerciseBinaryTree {
        //Finding max depth of tree : 
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Integer.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
    //check if tree is BTS:
    public static boolean isValidBST(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) >= res.get(i + 1)) return false;
        }
        return true;
    }
    //Inorder function - arrange tree in array
    public static void inorder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
//another solution

//class Solution {
//    public boolean isValidBST(TreeNode root) {
//        return validate(root, null, null);
//    }
//    public boolean validate(TreeNode root, Integer min, Integer max){
//        if (root == null)
//            return true;
//        if (min != null && root.val <= min)
//            return false;
//        if (max != null && root.val >= max)
//            return false;
//        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
//    }
//}






