# k-th Smallest in BST
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a BST and an integer <strong>k, </strong>the task is to find the <strong>kth</strong> smallest element in the BST. If there is no kth smallest element present then return -1.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> root = [2, 1, 3], k = 2
&nbsp;   <img style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid1_1738413633.png" alt="" width="269" height="217">
<strong>Output: </strong>2
<strong>Explanation:</strong> 2 is the 2nd smallest element in the BST.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> root = [2, 1, 3], k = 5
    <img style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid1_1738413633.png" alt="" width="274" height="221">
<strong>Output: </strong>-1
<strong>Explanation:</strong> There is no 5th smallest element in the BST as the size of BST is 3.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 3<br></span><span style="font-size: 18px;">    <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700498/Web/Other/blobid1_1736918049.jpg" width="270" height="241"> <br></span><span style="font-size: 18px;"><strong>Output: </strong>10
<strong>Explanation:</strong> 10 is the 3rd smallest element in the BST.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br></span></p>
<ul>
<li><span style="font-size: 18px;">1 &lt;= number of nodes, k &lt;= 10<sup>5<br></sup></span></li>
<li><span style="font-size: 18px;">1 &lt;= node-&gt;data &lt;= 10<sup>5</sup><sup><br></sup></span></li>
</ul></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Binary Search Tree" target="_blank" class="ui label problems_tag_label__A4Ism">Binary Search Tree</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>