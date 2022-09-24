// task description: https://www.codewars.com/kata/57e5a6a67fbcc9ba900021cd
import java.util.*;   
public class Solution {
    
    static TreeNode arrayToTree(int[] array) {
      if (array.length == 0) return null; 
      
      ArrayList<Integer> list = new ArrayList<Integer>(array.length);  
      for (int i : array) { list.add(i);}
 
      ArrayList<TreeNode> quene = new ArrayList<TreeNode>();
      TreeNode tree = new TreeNode(list.get(0));
      quene.add(tree);
      list.remove(0);
      
      while(list.size() > 0)
        {
        quene.get(0).left = new TreeNode(list.get(0));
        list.remove(0);
        quene.add(quene.get(0).left);
        if(list.size() > 0) {
           quene.get(0).right = new TreeNode(list.get(0));
           list.remove(0);
           quene.add(quene.get(0).right);
        }
        quene.remove(0);
        
        }
      return tree;
    }
  }

