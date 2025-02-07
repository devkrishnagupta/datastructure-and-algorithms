# Inorder Traversal
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Binary Tree, your task is to return its In-Order Traversal.</span></p>
<p><span style="font-size: 18px;"><span style="font-size: 18px;">An <strong>inorder traversal</strong> first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).</span></span></p>
<p><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Follow Up:</strong> Try solving this with O(1) auxiliary space.</span></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root[] = [1, 2, 3, 4, 5] 
      <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886461/Web/Other/blobid0_1738561309.png" alt="" width="288" height="253">
<strong>Output: </strong>[4, 2, 5, 1, 3]<br><strong>Explanation:</strong> The in-order traversal of the given binary tree is [4, 2, 5, 1, 3].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root[] = [8, 1, 5, N, 7, 10, 6, N, 10, 6]
      <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886461/Web/Other/blobid1_1738561309.png" alt="" width="285" height="254">
<strong>Output: </strong>[1, 7, 10, 8, 6, 10, 5, 6]<br><strong>Explanation:</strong> The in-order traversal of the given binary tree is <span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">[</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">1, 7, 10, 8, 6, 10, 5, 6].</span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br></span></p>
<ul>
<li><span style="font-size: 18px;">1 &lt;= number of nodes &lt;= 10<sup>5</sup><br></span></li>
<li><span style="font-size: 18px;">0 &lt;= node-&gt;data &lt;= 10<sup>5</sup></span></li>
</ul></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Tree" target="_blank" class="ui label problems_tag_label__A4Ism">Tree</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>