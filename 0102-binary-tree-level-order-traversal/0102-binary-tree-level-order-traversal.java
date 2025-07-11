class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainlist = new ArrayList<>();
        if (root == null) return mainlist;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                mainlist.add(list);
                list = new ArrayList<>();
                if (!queue.isEmpty()) queue.add(null);
                continue;
            }

            list.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return mainlist;
    }
}
