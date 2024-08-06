package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1991 {
    static class Tree{
        char data;
        Tree left;
        Tree right;

        public Tree(char data){
            this.data = data;
        }
    }

    public static Tree[] tree; //전체 순회 하기 싫어서 노드 개수만큼 만들어두는거임

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        tree=new Tree[N+1];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parentValue = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);

            if(tree[parentValue-'A'] == null){
                tree[parentValue-'A'] = new Tree(parentValue);
            }
            if(leftValue != '.'){
                tree[leftValue-'A'] = new Tree(leftValue);
                tree[parentValue-'A'].left = tree[leftValue-'A'];
            }
            if(rightValue != '.'){
                tree[rightValue-'A'] = new Tree(rightValue);
                tree[parentValue-'A'].right = tree[rightValue-'A'];
            }
        }
        preOrder(tree[0]);
        System.out.println();

        inOrder(tree[0]);
        System.out.println();

        postOrder(tree[0]);
        System.out.println();
    }

    public static void preOrder(Tree tree){
        if(tree == null) return;
        System.out.print(tree.data);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public static void inOrder(Tree tree){
        if(tree == null) return;
        inOrder(tree.left);
        System.out.print(tree.data);
        inOrder(tree.right);
    }

    public static void postOrder(Tree tree){
        if(tree == null) return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.data);
    }
}
