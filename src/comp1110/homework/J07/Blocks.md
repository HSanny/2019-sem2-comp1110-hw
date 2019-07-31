Within the `comp1110.homework.J07` package of the `comp1110-homework` project,
create a class `Blocks` that implements the method `public static int[]
flatten(int[] array)`. Given a row of block towers of different heights,
`flatten` will rearrange the blocks such that each tower is at an equal height.

If there are remaining blocks, they are to be placed as follows:

* The first remaining block is placed on the middle of the row. If this is not
possible, the first remaining block is placed on the closest block to the left
of the middle.
* The other remaining blocks are then placed in a left-right fashion moving out
from the middle.

Examples:

    Sample Input 1:            Sample Output 1:
    [3, 2, 2, 3]               [2, 3, 3, 2]

    Sample Input 2:            Sample Output 2:
    [1, 3, 5, 7, 9]            [5, 5, 5, 5, 5]

    Sample Input 3:            Sample Output 3:
    [1, 3, 4]                  [3, 3, 2]

Test your solution using the `J07` test.

Once you have it working, add and commit your work.