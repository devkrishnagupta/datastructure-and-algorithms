# Spirally traversing a matrix
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given a rectangular matrix, and your task is to return an array while <strong>traversing</strong>&nbsp;the matrix in <strong>spiral</strong> form.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: matrix[][] = [[1, 2, 3, 4],
&nbsp;                 [5, 6, 7, 8],
&nbsp;                 [9, 10, 11, 12],
&nbsp;                 [13, 14, 15,16]]
<strong>Output</strong>: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
<strong>Explanation</strong>:
</span><img style="height: 242px; width: 400px;" src="https://www.geeksforgeeks.org/wp-content/uploads/spiral-matrix.png" alt=""></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: matrix[][] = [[1, 2, 3, 4],
&nbsp;                 [5, 6, 7, 8],
&nbsp;                 [9, 10, 11, 12]]
<strong>Output</strong>: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
<strong>Explanation</strong>: Applying same technique as shown above, output for the 2nd testcase will be 1 2 3 4 8 12 11 10 9 5 6 7.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n<sup>2</sup>)<br><strong>Expected Auxiliary Space:</strong> O(n<sup>2</sup>)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= matrix.size(), </span><span style="font-size: 18px;">matrix[0].size()</span><span style="font-size: 18px;">&nbsp;&lt;= 100<br></span><span style="font-size: 18px;">0 &lt;= matrix[i][j]&lt;= 100</span></p></div>