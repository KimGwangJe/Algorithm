package Algorithm;

import java.util.ArrayList;

public class TreeTest {
    static class Tree{
        int data;
        Tree left;
        Tree right;

        Tree(int data){
            this.data = data;
        }

        public void setLeftTree(Tree left){
            this.left = left;
        }

        public void setRightTree(Tree right){
            this.right = right;
        }

        public Tree getLeftTree(){
            return this.left;
        }
        public Tree getRightTree(){
            return this.right;
        }
    }

    public static Tree readyToTree(){
        Tree root = new Tree(1);
        root.setLeftTree(new Tree(2));
        root.setRightTree(new Tree(3));
        root.getLeftTree().setLeftTree(new Tree(4));
        root.getLeftTree().setRightTree(new Tree(5));
        root.getRightTree().setLeftTree(new Tree(6));
        root.getRightTree().setRightTree(new Tree(7));

        return root;
    }

    public static void main(String[] args){
        Tree root = readyToTree();
        System.out.println("전위 순회");
        preOrder(root);
        System.out.println("중위 순회");
        inOrder(root);
        System.out.println("후위 순회");
        postOrder(root);
    }

    public static void preOrder(Tree tree){
        if(tree == null){
            return;
        }
        System.out.println(tree.data);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public static void inOrder(Tree tree){
        if(tree == null){
            return;
        }
        inOrder(tree.left);
        System.out.println(tree.data);
        inOrder(tree.right);
    }

    public static void postOrder(Tree tree){
        if(tree == null){
            return;
        }
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.println(tree.data);
    }
}
