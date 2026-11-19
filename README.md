# Placement & Lab Evaluation Preparation (Batch 2029) 🎯

<p align="center">
  <img src="https://img.shields.io/badge/Batch-2029-blue?style=for-the-badge&logo=target" alt="Batch 2029" />
  <img src="https://img.shields.io/badge/Total%20Problems-167-informational?style=for-the-badge" alt="Problems Count" />
  <img src="https://img.shields.io/badge/Solved-16%2F167-success?style=for-the-badge" alt="Solved Count" />
  <img src="https://img.shields.io/badge/Status-In%20Progress-orange?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/Target-Reopening%20Evaluation%20Test-red?style=for-the-badge" alt="Target" />
</p>

A structured, comprehensive problem collection and progress tracker for semester lab evaluation tests, technical interview rounds, and campus placement drives.

---

## 📊 Syllabus & Problem Breakdown

| Phase | Directory | Total Questions | Topics & Focus Areas |
| :---: | :--- | :---: | :--- |
| **Phase 1** | [`01-basic-programs/`](./01-basic-programs/) | **61** | Mathematical logic, Number systems, Bitwise operations, Patterns, 11 Sorting algorithms, and String parsing. |
| **Phase 2** | [`02-company-asked/`](./02-company-asked/) | **69** | Real technical interview questions (TCS, Infosys, Wipro, product rounds), Array puzzles, String manipulation, and OOP class design. |
| **Phase 3** | [`03-dsa-problems/`](./03-dsa-problems/) | **37** | Linked Lists, Stacks & Queues, BSTs, Graph Traversals (BFS/DFS), Shortest Path & MST, Dynamic Programming, and LRU Cache. |
| **Total** | | **167 Problems** | |

---

## 🗂️ Repository Architecture

```text
Placement-Prep-2029/
├── README.md                                  # Master roadmap and overview
├── .gitignore                                 # Excludes build binaries, caches, and temporary files
│
├── 01-basic-programs/                         # (61 Questions)
│   ├── README.md                              # Detailed index of Q1 - Q61 with status
│   ├── Program 01/ ... Program 16/            # Solved programs (.java)
│   └── Program 17/ ... Program 61/            # Starter templates (.java)
│
├── 02-company-asked/                          # (69 Questions)
│   ├── README.md                              # Detailed index of Q1 - Q69
│   ├── 01-arrays-and-math/                    # Dominant numbers, Kadane's algorithm, Stock profit
│   ├── 02-strings-and-patterns/               # Substrings, myAtoi, Balanced brackets, Words conversion
│   ├── 03-dynamic-programming-and-greedy/     # Jump Game, Coin Change, Rainwater trapping
│   └── 04-classes-and-design/                 # Custom Time class, Calculator, Key-Value store
│
├── 03-dsa-problems/                           # (37 Questions)
│   ├── README.md                              # Detailed index of Q1 - Q37
│   ├── 01-linked-lists/                       # Sorted insertions, Demerge Doubly LL, Add Two Numbers
│   ├── 02-stacks-and-queues/                  # Prefix/Postfix evaluation, Monotonic Stack, Queue by Stack
│   ├── 03-trees-and-bst/                      # BST modes, Invert tree, Tree from traversals
│   ├── 04-greedy-and-graphs/                  # BFS, DFS, Dijkstra, Kruskal, Prim, Cycle detection
│   ├── 05-dynamic-programming/                # 0/1 Knapsack, Climbing stairs, Sliding window maximum
│   └── 06-advanced-design-and-interview/      # Army of wizards, LRU Cache implementation
│
└── resources/
    └── references/                            # Original question bank PDFs
        ├── BasicProgramList.pdf
        ├── CompanyAskedPrograms.pdf
        └── DSAProblems.pdf
```

---

---

## 💡 Solution Template (Convention)

To keep code clean and interview-ready, structure each solution file as follows:

```java
/**
 * Problem: <Problem Title>
 * Category: <Array / String / Tree / DP>
 * Source: <Phase Folder / Question Number>
 * 
 * Approach:
 * - <Brief explanation of your approach>
 * 
 * Complexity:
 * - Time Complexity: O(...)
 * - Space Complexity: O(...)
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solution code
        sc.close();
    }
}
```

---

## 👤 Author
- **Prince Amareliya** ([@princeamareliya1](https://github.com/princeamareliya1))
- **Batch**: 2029
