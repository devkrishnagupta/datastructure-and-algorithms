# K Sum Paths
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a <strong>binary tree</strong> and an integer <strong>k</strong>, determine the number of <strong>downward-only</strong> paths where the sum of the node values in the path equals <strong>k</strong>. A path can <strong>start and end at any node</strong> within the tree but must always move <strong>downward</strong> (from parent to child).</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 7   <br><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700575/Web/Other/blobid0_1738924888.webp" width="318" height="243"><br>Output:</strong> 3</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>The following paths sum to k <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700575/Web/Other/blobid0_1722330388.jpg" width="313" height="313"> </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 3<strong><br></strong></span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700575/Web/Other/blobid0_1739181818.jpg" height="100"></pre>
<pre><span style="font-size: 18px;"><strong>Output:</strong> 2</span>
<span style="font-size: 18px;"><strong>Explanation:</strong>
Path 1 : 1 -&gt; 2 (Sum = 3)
Path 2 : 3 (Sum = 3)</span></pre>
<p><span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700575/Web/Other/blobid1_1739181850.jpg" height="100"></span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span></p>
<ul>
<li><span style="font-size: 18px;">1 ≤ number of nodes ≤ 10<sup>4</sup></span></li>
<li><span style="font-size: 18px;">-100 ≤ node value ≤ 100</span></li>
<li><span style="font-size: 18px;">-10<sup>9</sup> ≤ k ≤ 10<sup>9</sup></span></li>
</ul></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Tree" target="_blank" class="ui label problems_tag_label__A4Ism">Tree</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(h)</div></div></div></div>