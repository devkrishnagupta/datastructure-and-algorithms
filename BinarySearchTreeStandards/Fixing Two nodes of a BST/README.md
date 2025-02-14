# Fixing Two nodes of a BST
## Hard
<div class="problems_problem_content__Xm_eO"><div>
<div><span style="font-size: 18px;">Given the&nbsp;<strong>root</strong>&nbsp;of a Binary search tree(BST), where&nbsp;<strong>exactly t</strong></span><span style="font-size: 18px;"><strong>wo&nbsp;</strong>nodes were swapped by mistake. Your task is to fix (or correct) the BST by swapping them back. Do not change the structure of the tree.</span></div>
<div><span style="font-size: 18px;"><strong>Note:</strong> It is guaranteed that the given input will form BST, except for 2 nodes that will be wrong. All changes must be reflected in the original Binary search tree(BST).</span></div>
</div>
<div>&nbsp;</div>
<div><span style="font-size: 18px;"><strong>Examples :</strong></span></div>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [10, 5, 8, 2, 20]
     <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid0_1738654776.png" alt="" width="256" height="236">
<strong>Output: </strong>1<br></span>       <img style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid1_1738654776.png" alt="" width="255" height="235"><br><br><span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">The nodes 20 and 8 were swapped.</span><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [5, 10, 20, 2, 8]
     <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid2_1738654931.png" alt="" width="254" height="226">
<strong>Output: </strong>1 <br>     <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid3_1738654931.png" alt="" width="249" height="228">
<strong>Explanation:</strong> </span><span style="font-size: 18px;">The nodes 10 and 5 were swapped.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ Number of nodes ≤ 10<sup>3</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Binary Search Tree" target="_blank" class="ui label problems_tag_label__A4Ism">Binary Search Tree</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(h)</div></div></div></div>