# Left View of Binary Tree
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function <strong>leftView()</strong>, which accepts root of the tree as argument. If no left view is possible, return an empty tree.</span></p>
<p><span style="font-size: 18px;">Left view of following tree is 1 2 4 8.</span></p>
<p><span style="font-size: 18px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp; \<br>&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3<br>&nbsp;&nbsp; /&nbsp;&nbsp; &nbsp; \ &nbsp;&nbsp; /&nbsp;&nbsp;&nbsp; \<br>&nbsp; 4&nbsp;&nbsp;&nbsp;&nbsp; 5&nbsp;&nbsp; 6&nbsp;&nbsp;&nbsp; 7<br>&nbsp;&nbsp; \<br>&nbsp;&nbsp;&nbsp;&nbsp; 8&nbsp; &nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>&nbsp;  1
&nbsp;/&nbsp; \
3&nbsp; &nbsp; 2
<strong>Output: </strong>1 3
</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:
</strong><img style="height: 272px; width: 285px;" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190221103723/leftview.jpg" alt="">
<strong>Output: </strong>10 20 40
</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(N).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>0 &lt;= Number of nodes &lt;= 10<sup>5</sup><br>0 &lt;= Data of a node &lt;=&nbsp;</span><span style="font-size: 18px;">10</span><sup>5</sup></p></div>