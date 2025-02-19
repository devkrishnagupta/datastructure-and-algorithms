# Merge K sorted linked lists
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr[] </strong>of <strong>n</strong> <strong>sorted linked lists</strong> of different sizes. The task is to <strong>merge</strong> them in such a way that after merging they will be a <strong>single sorted</strong> linked list, then <strong>return </strong>the<strong> head</strong> of the merged linked list.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1 -&gt; 2 -&gt; 3, 4 -&gt; 5, 5 -&gt; 6, 7 -&gt; 8]
<strong>Output: </strong>1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 5 -&gt; 6 -&gt; 7 -&gt; 8<strong>
Explanation:<br></strong>The arr[] has 4 sorted linked list of size 3, 2, 2, 2.
1st list: 1 -&gt; 2-&gt; 3
2nd list: 4 -&gt; 5
3rd list: 5 -&gt; 6
4th list: 7 -&gt; 8
The merged list will be:
</span><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700265/Web/Other/blobid0_1737094930.png" width="388" height="68"> </pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1 -&gt; 3, 8, 4 -&gt; 5 -&gt; 6]
<strong>Output: </strong>1 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 8<strong>
Explanation:<br></strong>The arr[] has 3 sorted linked list of size 2, 3, 1.
1st list: 1 -&gt; 3
2nd list: 8
3rd list: 4 -&gt; 5 -&gt; 6
The merged list will be:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700265/Web/Other/blobid1_1722513386.png" width="400" height="70"></span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints</strong><br>1 &lt;= total no. of nodes &lt;= 10<sup>5</sup><sup><br></sup>1 &lt;= node-&gt;data &lt;= 10<sup>3</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Linked List" target="_blank" class="ui label problems_tag_label__A4Ism">Linked List</a><a href="/explore?category[]=Heap" target="_blank" class="ui label problems_tag_label__A4Ism">Heap</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>