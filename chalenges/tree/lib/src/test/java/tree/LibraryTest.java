/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void addTest() {
        Node root=new Node(7,null,null);

        BinarySearchTree tree = new BinarySearchTree(root);
        tree.root = new Node(7);

        Node node=new Node(1,null,null);
        tree.addTow(node,tree.root);
        Node nodeTow=new Node(9,null,null);
        tree.addTow(nodeTow,tree.root);
        assertEquals(9, tree.root.rigth.value);
        assertEquals(1, tree.root.left.value);
    }
    @Test public void preOrderTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.rigth = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.rigth = new Node(5);
//        System.out.println(tree.printPreorder());
        assertEquals("null1 2 4 5 3 ", tree.printPreorder());
    }
    @Test public void inorderTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.rigth = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.rigth = new Node(5);
        assertEquals("null4 2 5 1 3 ", tree.printInorder());
    }
    @Test public void postorderTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.rigth = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.rigth = new Node(5);
        assertEquals("null4 5 2 3 1 ", tree.printPostorder());
    }

    @Test public void instantiateTest() {
        Node root=new Node();

        BinarySearchTree tree = new BinarySearchTree(root);
        tree.root = new Node();
        System.out.println(tree);
        assertTrue(tree.root.value==0);
    }
    @Test public void instantiateOneNode() {
        Node root=new Node(7,null,null);

        BinarySearchTree tree = new BinarySearchTree(root);
        tree.root = new Node(7);

        assertEquals(7, tree.root.value);
    }

}
