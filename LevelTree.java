import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val){
            this.val = val;
        } 

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
public class LevelTree{
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue <TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wraplist = new LinkedList<>();

        if(root==null){
            return wraplist;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSum = queue.size();
            List <Integer> subList = new LinkedList<>();

            for(int i = 0; i <levelSum; i++){
                TreeNode currentnode = queue.poll();
                subList.add(currentnode.val);

                if(currentnode.left!= null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
                


            }
            wraplist.add(subList);            
        }
        return wraplist;
    }
    public static void main(String []args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Calling level order traversal
        LevelTree solution = new LevelTree();
        List<List<Integer>> result = solution.levelOrder(root);

        // Printing the result
        System.out.println(result);
    }
    
}