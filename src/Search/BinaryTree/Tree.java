package Search.BinaryTree;

class T{
    int data;
    T left;
    T right;

    T(int d){
        data = d;
    }

    public T addLeft(T t){
        left = t;
        return left;
    }
    public T addRight(T t){
        right = t;
        return right;
    }

    public T getLeft(){
        return left;
    }

    public T getRight(){
        return right;
    }
}

public class Tree {
    public static void main(String[] args){
        T t = new T(1);

        T t2 = t.addLeft(new T(2));
        t2.addLeft(new T(4));
        t2.addRight(new T(5));

        T t3 = t.addRight(new T(3));
        t3.addLeft(new T(6));
        t3.addRight(new T(7));

        System.out.println("전위순회");
        preOrder(t); // 전위순회
        System.out.println("중위순회");
        inOrder(t); // 중위순회
        System.out.println("후위순회");
        postOrder(t); // 후위순회
    }

    //전위순회
    public static void preOrder(T t){
        if(t == null) return;
        System.out.println(t.data);
        preOrder(t.left);
        preOrder(t.right);
    }

    //중위순회
    public static void inOrder(T t){
        if(t == null) return;
        inOrder(t.left);
        System.out.println(t.data);
        inOrder(t.right);
    }

    //후위순회
    public static void postOrder(T t){
        if(t == null) return;
        postOrder(t.left);
        postOrder(t.right);
        System.out.println(t.data);
    }
}
