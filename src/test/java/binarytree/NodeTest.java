package binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NodeTest{

    private Node tree;

    @BeforeEach
    void setup(){
        tree = new Node(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(8);
    }

    @Test
    void shouldInsertIntoTree(){
        // When: 20 is inserted into the tree
        tree.insert(20);

        // Then: The tree should contain 20
        Assertions.assertTrue(tree.contains(20));
        Assertions.assertFalse(tree.contains(100));
    }

    @Test
    void shouldContain(){
        // Given: The initial tree has 10 in it
        // Expect: The tree to contain 10
        Assertions.assertTrue(tree.contains(10));
    }

}
