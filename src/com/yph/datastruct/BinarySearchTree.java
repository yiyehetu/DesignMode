package com.yph.datastruct;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    private static class BinaryNode<AnyType> {
        AnyType element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;

        BinaryNode(AnyType theElement) {
            this(theElement, null, null);
        }

        BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
            element = theElement;
            left = lt;
            right = rt;
        }
    }

    private BinaryNode<AnyType> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(AnyType x) {
        return contains(root, x);
    }

    public AnyType findMin() {
        if (isEmpty()) {
            throw new RuntimeException("tree is empty");
        }
        return findMin(root).element;
    }

    public AnyType findMax() {
        if (isEmpty()) {
            throw new RuntimeException("tree is empty");
        }
        return findMax(root).element;
    }

    public void inset(AnyType x){
        root = insert(x, root);
    }

    public void remove(AnyType x){
        root = remove(x, root);
    }

    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> root) {
        return null;
    }

    private BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> root) {
        return null;
    }

    private BinaryNode<AnyType> findMin(BinaryNode<AnyType> root) {
        return null;
    }

    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> root) {
        return null;
    }

    private boolean contains(BinaryNode<AnyType> root, AnyType x) {

        return false;
    }


}
