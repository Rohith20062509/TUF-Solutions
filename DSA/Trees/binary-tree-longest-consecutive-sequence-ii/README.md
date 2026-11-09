# [436. Binary Tree Longest Consecutive Sequence II
POTD](https://takeuforward.org/practice/dsa/binary-tree-longest-consecutive-sequence-ii)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given the root of a binary tree, return the length of the longest consecutive path in the tree.

A consecutive path is a path where the values of the consecutive nodes in the path differ by one. This path can be either increasing or decreasing.

- For example, [1,2,3,4] and [4,3,2,1] are both considered valid, but the path [1,2,4,3] is not valid.

On the other hand, the path can be in the child-Parent-child order, where not necessarily be parent-child order.

### Example 1:

**Input:** root = [1,2,3]

**Output:** 2

**Explanation:** The longest consecutive path is [1, 2] or [2, 1].

### Example 2:

**Input:** root = [2,1,3]

**Output:** 3

**Explanation:** The longest consecutive path is [1, 2, 3] or [3, 2, 1].

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- The number of nodes in the tree is in the range [1, 3 * 10^4].
- -3 * 10^4 <= Node.val <= 3 * 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
