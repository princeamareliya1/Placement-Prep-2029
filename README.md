# Placement & Lab Evaluation Preparation (Batch 2029) 🎯

<p align="center">
  <img src="https://img.shields.io/badge/Batch-2029-blue?style=for-the-badge&logo=target" alt="Batch 2029" />
  <img src="https://img.shields.io/badge/Total%20Problems-167-success?style=for-the-badge" alt="Problems Count" />
  <img src="https://img.shields.io/badge/Status-In%20Progress-orange?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/Target-Reopening%20Evaluation%20Test-red?style=for-the-badge" alt="Target" />
</p>

A structured, comprehensive problem collection and progress tracker for semester lab evaluation tests, technical interview rounds, and campus placement drives.

---

## 📌 Context & Motivation

- **Assessment Target**: Programming evaluation test conducted on semester reopening day (Dec 5–7).
- **Academic Impact**: Determines student divisions and dedicated lab batches.
- **Preparation Schedule**: 20 Days dedicated daily practice plan (3–4 hours/day).
- **Scope**: 167 total curated problems ranging from basic programming to core DSA and company-specific interview challenges.

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
│   ├── README.md                              # Detailed index of Q1 - Q61
│   ├── 01-logic-and-conditionals/             # Armstrong, Ugly, Kaprekar, Automorphic numbers, Loops
│   ├── 02-number-systems-and-bits/            # BCD, Hex-Oct-Bin conversions, Bitwise distance
│   ├── 03-patterns/                           # Concentric number matrix, Pyramid, Star patterns
│   ├── 04-arrays-and-sorting/                 # All 11 Sorting Algos, In-place rotations, Pair sum
│   └── 05-strings-and-parsing/                # Palindromes, Lexicographic permutations, Anagrams
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

```cpp
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

#include <iostream>
using namespace std;

int main() {
    // Solution code
    return 0;
}
```

---

## 👤 Author
- **Prince Amareliya** ([@princeamareliya1](https://github.com/princeamareliya1))
- **Batch**: 2029
