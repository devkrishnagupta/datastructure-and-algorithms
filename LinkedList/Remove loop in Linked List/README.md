# Remove loop in Linked List
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given the head of a linked list that may contain a loop.&nbsp; A loop means that the last node of the linked list is connected back to a node in the same list. The task is to remove the loop from the linked list (if it exists).</span></p>
<p><span style="font-size: 14pt;"><strong>Custom Input format:</strong></span></p>
<p><span style="font-size: 14pt;">A <strong>head </strong>of a singly linked list and a <strong>pos </strong>(1-based index) which denotes the position of the node to which the last node points to. If <strong>pos = 0</strong>, it means the last node points to null, indicating there is no loop.</span></p>
<p><span style="font-size: 14pt;">The generated output will be&nbsp;<strong>true </strong>if there is no loop in list and other nodes in the list remain unchanged, otherwise, <strong>false</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head =<strong> </strong>1 -&gt; 3 -&gt; 4, pos = 2
<strong>Output: </strong>true<strong>
Explanation: </strong>The linked list looks like<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid0_1718609709.png" width="403" height="161"><br>A loop is present in the list, and it is removed.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head = 1 -&gt; 8 -&gt; 3 -&gt; 4, pos = 0
<strong>Output: </strong>true<strong>
Explanation: <br></strong><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid0_1718609876.png" height="100"><br></strong>The Linked list does not contains any loop. </span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head =<strong> </strong>1 -&gt; 2 -&gt; 3 -&gt; 4, pos = 1
<strong>Output: </strong>true<strong>
Explanation: </strong>The linked list looks like <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid2_1718609744.png" width="400" height="160"><br>A loop is present in the list, and it is removed.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ size of linked list ≤ 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Linked List" target="_blank" class="ui label problems_tag_label__A4Ism">Linked List</a><a href="/explore?category[]=two-pointer-algorithm" target="_blank" class="ui label problems_tag_label__A4Ism">two-pointer-algorithm</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>