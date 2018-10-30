class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        boolean matched = false;
        while (cur!=null || !stack.isEmpty()) {
            if (cur!=null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode tn = stack.pop();
                if (matched) {
                    return tn;
                } else {
                    if (p==tn) matched = true;
                    cur = tn.right;
                }
            }
        }
         
        return null;
    }
}
