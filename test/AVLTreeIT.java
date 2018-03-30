/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hanan
 */
public class AVLTreeIT {
    
    public AVLTreeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of height method, of class AVLTree.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        Node N = null;
        AVLTree instance = new AVLTree();
        int expResult = 0;
        int result = instance.height(N);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class AVLTree.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 0;
        int b = 0;
        AVLTree instance = new AVLTree();
        int expResult = 0;
        int result = instance.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightRotate method, of class AVLTree.
     */
    @Test
    public void testRightRotate() {
        System.out.println("rightRotate");
        Node y = null;
        AVLTree instance = new AVLTree();
        Node expResult = null;
        Node result = instance.rightRotate(y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftRotate method, of class AVLTree.
     */
    @Test
    public void testLeftRotate() {
        System.out.println("leftRotate");
        Node x = null;
        AVLTree instance = new AVLTree();
        Node expResult = null;
        Node result = instance.leftRotate(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class AVLTree.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Node N = null;
        AVLTree instance = new AVLTree();
        int expResult = 0;
        int result = instance.getBalance(N);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AVLTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Node node = null;
        int key = 0;
        AVLTree instance = new AVLTree();
        Node expResult = null;
        Node result = instance.insert(node, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrder method, of class AVLTree.
     */
    @Test
    public void testPreOrder() {
        System.out.println("preOrder");
        Node node = null;
        AVLTree instance = new AVLTree();
        instance.preOrder(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AVLTree.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AVLTree.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
