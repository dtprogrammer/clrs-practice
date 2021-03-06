/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017. Duct Tape Programmer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package dtprogrammer.github.io.clrs.ten;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 10.4-3 Write an O(n)-time nonrecursive procedure that, given an n-node binary tree, prints out the key of
 * each node in the tree. Use a stack as an auxiliary data structure.
 */
class TreeNonRecursiveTraversal {
    static void print(BinaryTree.TreeNode root) {
        Deque<BinaryTree.TreeNode> stack = new LinkedList<>();

        stack.addLast(root);
        while (!stack.isEmpty() && stack.getLast() != null) {
            BinaryTree.TreeNode node = stack.removeLast();
            System.out.println(node.data);
            if (node.left != null) {
                stack.addLast(node.left);
            }
            if (node.right != null) {
                stack.addLast(node.right);
            }
        }
    }
}
