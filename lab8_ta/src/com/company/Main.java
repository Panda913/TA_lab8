package com.company;

public class Main {

        public static void main(String[] args) {
            HashTable<OwnClass, LinkedList> tableLinkedList1 = new HashTable<>(LinkedList.class);
            HashTable<OwnClass, LinkedList> tableLinkedList2 = new HashTable<>(LinkedList.class);
            HashTable<OwnClass, LinkedList> tableLinkedList3 = new HashTable<>(LinkedList.class);
            HashTable<OwnClass, LinkedList> tableLinkedList4 = new HashTable<>(LinkedList.class);

            HashTable<OwnClass, BinaryTree> tableBinaryTree1 = new HashTable<>(BinaryTree.class);
            HashTable<OwnClass, BinaryTree> tableBinaryTree2 = new HashTable<>(BinaryTree.class);
            HashTable<OwnClass, BinaryTree> tableBinaryTree3 = new HashTable<>(BinaryTree.class);
            HashTable<OwnClass, BinaryTree> tableBinaryTree4 = new HashTable<>(BinaryTree.class);


            System.out.println("\u001B[31m" + "HASH TABLE W/ LINKEDLIST" + "\u001B[0m");
            long time = System.nanoTime();
            addElements_linked(tableLinkedList1, 1000);
            System.out.println("Adding 1000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_linked(tableLinkedList2, 10000);
            System.out.println("Adding 10000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_linked(tableLinkedList3, 100000);
            System.out.println("Adding 100000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_linked(tableLinkedList4, 200000);
            System.out.println("Adding 200000 time = " + (System.nanoTime() - time));

            System.out.println();

            System.out.println("\u001B[31m" + "HASH TABLE W/ BINARY TREE" + "\u001B[0m");
            time = System.nanoTime();
            addElements_tree(tableBinaryTree1, 1000);
            System.out.println("Adding 1000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_tree(tableBinaryTree2, 10000);
            System.out.println("Adding 10000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_tree(tableBinaryTree3, 100000);
            System.out.println("Adding 100000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_tree(tableBinaryTree4, 200000);
            System.out.println("Adding 200000 time = " + (System.nanoTime() - time));

            System.out.println("\u001B[31m" + "SEARCH 500 IN HASH TABLE W/ LINKEDLIST" + "\u001B[0m");
            time = System.nanoTime();
            searchElements_linked(tableLinkedList1);
            System.out.println("Searching in 1000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_linked(tableLinkedList2);
            System.out.println("Searching in 10000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_linked(tableLinkedList3);
            System.out.println("Searching in 100000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_linked(tableLinkedList4);
            System.out.println("Searching in 200000 = " + (System.nanoTime() - time));

            System.out.println("\u001B[31m" + "SEARCH 500 IN HASH TABLE W/ BINARYTREE" + "\u001B[0m");
            time = System.nanoTime();
            searchElements_tree(tableBinaryTree1);
            System.out.println("Searching in 1000 = " + (System.nanoTime()- time));
            time = System.nanoTime();
            searchElements_tree(tableBinaryTree2);
            System.out.println("Searching in 10000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_tree(tableBinaryTree3);
            System.out.println("Searching in 100000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_tree(tableBinaryTree4);
            System.out.println("Searching in 200000 = " + (System.nanoTime() - time));

            LinkedList<OwnClass> linkedList1 = new LinkedList<>();
            LinkedList<OwnClass> linkedList2 = new LinkedList<>();
            LinkedList<OwnClass> linkedList3 = new LinkedList<>();
            LinkedList<OwnClass> linkedList4 = new LinkedList<>();

            BinaryTree<OwnClass> binaryTree1 = new BinaryTree<>();
            BinaryTree<OwnClass> binaryTree2 = new BinaryTree<>();
            BinaryTree<OwnClass> binaryTree3 = new BinaryTree<>();
            BinaryTree<OwnClass> binaryTree4 = new BinaryTree<>();

            System.out.println("\u001B[31m" + "SIMPLE LINKEDLIST" + "\u001B[0m");
            time = System.nanoTime();
            addElements_linkedlist(linkedList1, 1000);
            System.out.println("Adding 1000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_linkedlist(linkedList2, 10000);
            System.out.println("Adding 10000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_linkedlist(linkedList3, 100000);
            System.out.println("Adding 100000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_linkedlist(linkedList4, 200000);
            System.out.println("Adding 200000 time = " + (System.nanoTime() - time));

            System.out.println("\u001B[31m" + "SIMPLE BINARY TREE" + "\u001B[0m");
            time = System.nanoTime();
            addElements_binarytree(binaryTree1, 1000);
            System.out.println("Adding 1000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_binarytree(binaryTree2, 10000);
            System.out.println("Adding 10000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_binarytree(binaryTree3, 100000);
            System.out.println("Adding 100000 time = " + (System.nanoTime() - time));
            time = System.nanoTime();
            addElements_binarytree(binaryTree4, 200000);
            System.out.println("Adding 200000 time = " + (System.nanoTime() - time));

            System.out.println("\u001B[31m" + "SEARCH 500 IN LINKED LIST" + "\u001B[0m");
            time = System.nanoTime();
            searchElements_linkedList(linkedList1);
            System.out.println("Searching in 1000 = " + (System.nanoTime()- time));
            time = System.nanoTime();
            searchElements_linkedList(linkedList2);
            System.out.println("Searching in 10000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_linkedList(linkedList3);
            System.out.println("Searching in 100000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_linkedList(linkedList4);
            System.out.println("Searching in 200000 = " + (System.nanoTime() - time));

            System.out.println("\u001B[31m" + "SEARCH 500 IN BINARY TREE" + "\u001B[0m");
            time = System.nanoTime();
            searchElements_binarytree(binaryTree1);
            System.out.println("Searching in 1000 = " + (System.nanoTime()- time));
            time = System.nanoTime();
            searchElements_binarytree(binaryTree2);
            System.out.println("Searching in 10000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_binarytree(binaryTree3);
            System.out.println("Searching in 100000 = " + (System.nanoTime() - time));
            time = System.nanoTime();
            searchElements_binarytree(binaryTree4);
            System.out.println("Searching in 200000 = " + (System.nanoTime() - time));





        }
    public static void searchElements_linkedList(LinkedList<OwnClass> list){
        for( int i = 0; i < 500; i ++ ){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            list.contains(element);
        }
    }

    public static void searchElements_binarytree(BinaryTree<OwnClass> tree){
        for( int i = 0; i < 500; i ++ ){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            tree.contains(element);
        }
    }

    public static void addElements_linkedlist(LinkedList<OwnClass> list, int number){
        for(int i = 0; i < number; i++){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            list.add(element);
        }

    }

    public static void addElements_binarytree(BinaryTree<OwnClass> tree, int number){
        for(int i = 0; i < number; i++){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            tree.add(element);
        }

    }

    public static void searchElements_linked(HashTable<OwnClass, LinkedList> table){
        for( int i = 0; i < 500; i ++ ){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            table.contains(element);
        }
    }

    public static void searchElements_tree(HashTable<OwnClass, BinaryTree> table){
        for( int i = 0; i < 500; i ++ ){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            table.contains(element);
        }
    }

    public static void addElements_linked(HashTable<OwnClass, LinkedList> table, int number){
        for(int i = 0; i < number; i++){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            table.add(element);
        }

    }

    public static void addElements_tree(HashTable<OwnClass, BinaryTree> table, int number){
        for(int i = 0; i < number; i++){
            OwnClass element = new OwnClass((int)(Math.random()*1000), randomWord(), (int)(Math.random()*1000));
            table.add(element);
        }

    }

    public static String randomWord(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String str = "";
        for( int i = 0; i < 10; i++){
            str += alphabet[(int)(Math.random()*10)];
        }
        return str;
    }
}
