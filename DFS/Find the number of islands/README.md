# Find the number of islands
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of '0's (Water)&nbsp;and '1's(Land). Find the number of islands.</span><br><br><span style="font-size: 14pt;"><strong>Note:&nbsp;</strong>An island is either surrounded by water or the boundary of a grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>grid = [[0,1],[1,0],[1,1],[1,0]]
<strong>Output: </strong>1
<strong>Explanation:
</strong>The grid is-
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700273/Web/Other/blobid0_1728204704.png" alt="">
All lands are connected.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>grid = [[0,1,1,1,0,0,0],[0,0,1,1,0,1,0]]
<strong>Output: </strong>2
<strong>Expanation:
</strong>The grid is-<br> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700273/Web/Other/blobid1_1728204704.png" alt="">
There are two islands :- one is colored in "blue" and other in "red".
</span></pre>
<p><span style="font-size: 14pt;"><strong>Expected Time Complexity:&nbsp;</strong>O(n*m)<br><strong>Expected Space Complexity:&nbsp;</strong>O(n*m)</span></p>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 500<br><span style="background-color: #ffffff; font-family: Arial; white-space-collapse: preserve;">grid[i][j] = {'</span>0', '1'}</span></p></div>