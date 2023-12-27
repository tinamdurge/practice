package org.example;

public class BinarySearchTree <T extends Comparable<T>>{
    Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T data){
        root = insertRec(root,data);
    }

    private Node<T> insertRec(Node<T> root, T data) {
        if(root == null){
            root = new Node<>(data);
            return root;
        }
        if(data.compareTo(root.data)<0){
            root.left = insertRec(root.left,data);
        } else if(data.compareTo(root.data)>0){
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    public void inorderTraversal(Node<T> root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    public void preorderTraversal(Node<T> root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    public void postorderTraversal(Node<T> root){
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public boolean search(T data){
        return searchData(root,data);
    }

    private boolean searchData(Node<T> root, T data) {
        if (root == null){
            return false;
        }

        if(data.equals(root.data)){
            return true;
        }

        if(data.compareTo(root.data) < 0){
            return searchData(root.left,data);
        } else {
            return searchData(root.right,data);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);

        System.out.println("\nInorder Traversal: ");
        binarySearchTree.inorderTraversal();

        System.out.println("\nPreorder Traversal: ");
        binarySearchTree.preorderTraversal();

        System.out.println("\nPostorder Traversal: ");
        binarySearchTree.postorderTraversal();

        int searchData = 50;
        if(binarySearchTree.search(searchData)){
            System.out.println("\n" +searchData + " found in BST");
        } else {
            System.out.println("\n"+searchData +" not fount in BST");
        }
    }
}
