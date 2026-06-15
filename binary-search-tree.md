[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamaları


Dizi sırayla verildiyse ilk eleman root olur.
7 bizim root'umuz.
5, 7'nin soluna gelir.
    7
   /
  5
1, 7'nin solundaki 5'in soluna gelir.
       7
     /
    5
   /
  1
8, 7'nin sağına gelir.
      7
     / \
    5   8
   /
  1
3, 7 nin solundaki 5'in solundaki 1'in sağına gelir.
      7
     / \
    5   8
   /
  1
   \
    3
6,7'nin solundaki 5'in sağına gelir.
      7
     / \
    5   8
   / \
  1   6
   \
    3
0, 7'nin solundaki 5'in solundaki 1'in soluna gelir.
        7
       / \
      5   8
     / \
    1   6
   / \
  0   3
9,7'nin sağındaki 8'in sağına gelir.
        7
       / \
      5   8
     / \    \
    1   6     9
   / \
  0   3
4,7'nin solundaki 5'in solundaki 1'in sağındaki 3'ün sağına gelir.
        7
       / \
      5   8
     / \   \
    1   6   9
   / \
  0   3
         \
           4
2, 7'nin solundaki 5'in solundaki 1'in sağındaki 3'ün soluna gelir.
          7
        /   \
       5     8
      / \     \
     1   6     9
    / \
   0   3
      / \
     2   4
