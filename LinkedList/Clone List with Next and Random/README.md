# Clone List with Next and Random
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given a special linked list with <strong>n</strong> nodes where each node has two pointers a <strong>next pointer</strong> that points to the next node of the singly linked list, and a <strong>random pointer</strong> that points to the random node of the linked list.<br></span></p>
<p><span style="font-size: 14pt;">Construct a <strong>copy</strong> of this linked list.&nbsp;</span><span style="font-size: 18.6667px;">The copy should consist of the same number of new nodes, where each new node has the value corresponding to its original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list, such that it also represent the same list state. </span><span style="font-size: 18.6667px;">None of the pointers in the new list should point to nodes in the original list.</span></p>
<p><span style="font-size: 14pt;">Return the <strong>head</strong> of the copied linked list.</span></p>
<p><span style="font-size: 14pt;"><strong>NOTE : </strong>Original linked list should remain unchanged.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong>head = [[1, 3], [3, 3], [5, NULL], [9, 3]]<span style="font-size: 14pt;"> <br>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/885813/Web/Other/blobid2_1737541602.jpg" width="416" height="142"> &nbsp; <br></span><strong style="font-size: 14pt;">Output: </strong><span style="font-size: 14pt;">head</span><strong style="font-size: 14pt;"> </strong><span style="font-size: 14pt;">=</span><strong style="font-size: 14pt;"> </strong><span style="font-size: 14pt;">[[1, 3], [3, 3], [5, NULL], [9, 3]]<span style="font-size: 14pt;"> </span></span><strong style="font-size: 14pt;">
Explanation: </strong>
Node 1 points to Node 2 as its NEXT and Node 3 as its RANDOM.
Node 2 points to Node 3 as its NEXT and Node 3 as its RANDOM.
Node 3<strong> </strong>points to Node 4 as its NEXT and NULL as its RANDOM.
Node 4 points to NULL as its NEXT and Node 3 as its RANDOM.</span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong>head = [[1, 3], [2, 1], [3, 5], [4, 3], [5, 2]]<span style="font-size: 14pt;"><br>  <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700186/Web/Other/blobid2_1735042710.jpg" width="467" height="131"><br> <br></span><strong style="font-size: 14pt;">Output: </strong><span style="font-size: 14pt;">head</span><strong style="font-size: 14pt;"> = </strong><span style="font-size: 14pt;">[[1, 3], [2, 1], [3, 5], [4, 3], [5, 2]]</span><strong style="font-size: 14pt;">
Explanation: </strong>
<span style="font-size: 18.6667px;">Node 1 points to Node 2 as its NEXT and Node 3 as its RANDOM.
Node 2 points to Node 3 as its NEXT and Node 1 as its RANDOM.
Node 3 points to Node 4 as its NEXT and Node 5 as its RANDOM.
Node 4 points to Node 5 as its NEXT and Node 3 as its RANDOM.
Node 5 points to NULL as its NEXT and Node 2 as its RANDOM.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong>head = [[7, NULL], [7, NULL]]<span style="font-size: 14pt;"><br></span><strong style="font-size: 14pt;">Output: </strong><span style="font-size: 14pt;">head</span><strong style="font-size: 14pt;"> </strong><span style="font-size: 14pt;">=</span><strong style="font-size: 14pt;"> </strong><span style="font-size: 14pt;">[[7, NULL], [7, NULL]]</span><strong style="font-size: 14pt;">
Explanation: </strong>
Node 1<strong> </strong>points to Node 2 as its NEXT and NULL as its RANDOM.
Node 2 points to NULL as its NEXT and NULL as its RANDOM.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints</strong>:<br>1 &lt;= n &lt;= 100<br><span style="font-size: 18px;">0 &lt;= node-&gt;data &lt;= 1000</span></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Linked List" target="_blank" class="ui label problems_tag_label__A4Ism">Linked List</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>