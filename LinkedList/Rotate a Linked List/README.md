# Rotate a Linked List
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given the&nbsp;</span><strong style="font-size: 18px;">head </strong><span style="font-size: 18px;">of a singly linked list,</span><span style="font-size: 18px;"> the task is to rotate&nbsp;</span><span style="font-size: 18px;">the linked list anti-clockwise by </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;"> nodes, i.e., </span><strong style="font-size: 18px;">left-shift</strong><span style="font-size: 18px;"> the linked list by </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;"> nodes, where </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;"> is a given positive integer smaller than or equal to length of the linked list.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>linkedlist: 2-&gt;4-&gt;7-&gt;8-&gt;9 , k = 3
<strong>Output: </strong>8-&gt;9-&gt;2-&gt;4-&gt;7<strong>
Explanation:<br></strong></span><span style="font-size: 18px;"><strong>Rotate 1:&nbsp;</strong>4 -&gt; 7 -&gt; 8 -&gt; 9 -&gt; 2</span>
<span style="font-size: 18px;"><strong>Rotate 2:</strong>&nbsp;7&nbsp;-&gt; 8&nbsp;-&gt; 9&nbsp;-&gt; 2&nbsp;-&gt; 4</span>
<span style="font-size: 18px;"><strong>Rotate 3:</strong>&nbsp;8&nbsp;-&gt; 9&nbsp;-&gt; 2&nbsp;-&gt; 4&nbsp;-&gt; 7<br></span><strong style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700023/Web/Other/blobid0_1721799624.png" width="400" height="160"></strong>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>linkedlist: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7-&gt;8 , k = 4
<strong>Output: </strong>5-&gt;6-&gt;7-&gt;8-&gt;1-&gt;2-&gt;3-&gt;4<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700023/Web/Other/blobid1_1721799675.png" width="400" height="160"></span>
</pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(n)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(1)</span></p>
<p><span style="font-size: 18px;"><strong style="font-size: 18px;">Constraints:</strong><br><span style="font-size: 18px;">1 &lt;= number of nodes &lt;= 10</span><sup style="font-size: 18px;">3<br></sup><span style="font-size: 18px;">1 &lt;= node -&gt; data &lt;= 10<sup>4</sup></span><br><span style="font-size: 18px;">1 &lt;= k &lt;=&nbsp;</span></span><span style="font-size: 18px;">number of nodes</span><span style="font-size: 18px;">&nbsp;</span></p></div>