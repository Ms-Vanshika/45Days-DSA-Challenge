/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class zigzagtraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int counter = 1;
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);
            for(int i = 0;i < levelsize ; i++){
                
                if(counter % 2 == 0){
                    TreeNode currentnode = queue.pollLast();
                    currentlevel.add(currentnode.val);
                    if(currentnode.right != null){
                        queue.addFirst(currentnode.right);
                    }
                    if(currentnode.left != null){
                        queue.addFirst(currentnode.left);
                    }
                } else{
                    TreeNode currentnode = queue.pollFirst();
                    currentlevel.add(currentnode.val);
                    if(currentnode.left != null){
                       queue.addLast(currentnode.left);
                    }
                    if(currentnode.right != null){
                        queue.addLast(currentnode.right);
                    }
                }
            }
            counter++;
            result.add(currentlevel);
        }
        return result;
    }
}
