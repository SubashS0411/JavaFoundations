import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
//    leecode problem:104. Maximum Depth of Binary Tree
//    https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
  }
  class Solution {
      public static void main(String[] args) {
          // 1. Create the individual nodes
          TreeNode root = new TreeNode(1);
          TreeNode leftChild = new TreeNode(2);
          TreeNode rightChild = new TreeNode(3);
          TreeNode leftChild1 = new TreeNode(2);
          TreeNode rightChild1 = new TreeNode(3);
          root.left = leftChild;
          root.right = rightChild;
          root.left.left = leftChild1;
          root.right.right = rightChild1;


          // 2. Wire them together!
          root.left = leftChild;
          root.right = rightChild;
          System.out.println(maxDepth(root));
      }
      public static int maxDepth(TreeNode root) {
          if(root==null){
              return 0;
          }
//          int maxleft=maxDepth(root.left);
//          int maxright=maxDepth(root.right);
//          return Math.max(maxleft,maxright)+1;
//          or
          return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
      }

//      leetcode problem :100. Same Tree
//      https://leetcode.com/problems/same-tree/description/
      public static boolean isSameTree(TreeNode p, TreeNode q) {
          if(p==null && q==null){
              return true;
          }
          if (p == null || q == null) {
              return false;
          }
          if(p.val !=q.val){
              return false;
          }
          return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
      }
//      Leetcode problem: 226. Invert Binary Tree
//      https://leetcode.com/problems/invert-binary-tree/description/
      public static TreeNode invertTree(TreeNode root) {
          if(root==null){
              return null;
          }
          TreeNode temp=root.left;
          root.left=root.right;
          root.right=temp;
          invertTree(root.left);
          invertTree(root.right);
          return root;

      }

      public static int diameterOfBinaryTree(TreeNode root) {
          System.out.println(calculateDepth(root));

      }
      public static int calculateDepth(TreeNode root){
          int maxdiameter=0;
          if(root==null){
              return 0;
          }
          int rightside=calculateDepth(root.right);
          int leftside=calculateDepth(root.left);
          maxdiameter=Math.max(maxdiameter,leftside+rightside);
          return Math.max(leftside,rightside)+1;
      }
//      LeetCode Problem :102.Binary Tree Level Order Traversal
//      https://leetcode.com/problems/binary-tree-level-order-traversal/description/
      public List<List<Integer>> levelOrder(TreeNode root){
          List<List<Integer>> album=new ArrayList<>();
          if(root==null){
              return album;

          }
          Queue<Integer> queue=new LinkedList<>();
          queue.offer(root);
          while(!queue.isEmpty()){
              int levelSize=queue.size();
              List<Integer> currentlevel=new ArrayList<>();
              for (int i = 0; i < levelSize; i++) {
                  TreeNode currentNode=queue.poll();
                  currentlevel.add(currentNode.val);
                  if(currentlevel.left!=null){
                      queue.offer(currentNode.left);
                  }
                  if(currentlevel.right!=null){
                      queue.offer(currentNode.right);
                  }
              }
              album.add(currentlevel);
          }
          return album;
      }
  }