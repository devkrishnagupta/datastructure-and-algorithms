# Tree Boundary Traversal
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order:&nbsp;</span></p>
<ol>
<li>
<p data-pm-slice="1 1 []"><span style="font-size: 14pt;"><strong>Left Boundary:</strong> This includes all the nodes on the path from the root to the leftmost leaf node. You must prefer the left child over the right child when traversing. Do not include leaf nodes in this section.</span></p>
</li>
<li>
<p data-pm-slice="1 1 []"><span style="font-size: 14pt;"><strong>Leaf Nodes:</strong> All leaf nodes, in left-to-right order, that are not part of the left or right boundary.</span></p>
</li>
<li>
<p data-pm-slice="1 1 []"><span style="font-size: 14pt;"><strong>Reverse Right Boundary: </strong>This includes all the nodes on the path from the rightmost leaf node to the root, traversed in reverse order. You must prefer the right child over the left child when traversing. Do not include the root in this section if it was already included in the left boundary.</span></p>
</li>
</ol>
<p><span style="font-size: 14pt;">Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary.&nbsp;</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]<strong>
Output: </strong>[<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">4</span>, <span class="hljs-number">8</span>, <span class="hljs-number">9</span>, <span class="hljs-number">6</span>, <span class="hljs-number">7</span>, <span class="hljs-number">3</span>]<strong>
Explanation:
</strong><strong><img style="height: 300px; width: 300px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20211103204119/graph4-300x300.png" alt=""></strong>
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [1, 2, N, 4, 9, 6, 5, N, 3, N, N, N, N 7, 8]<strong>
Output: </strong>[<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">4</span>, <span class="hljs-number">6</span>, <span class="hljs-number">5</span>, <span class="hljs-number">7</span>, <span class="hljs-number">8</span>]
<strong>Explanation:
</strong><a href="https://contribute.geeksforgeeks.org/wp-content/uploads/boundary.png"><img style="float: left; height: 300px; width: 300px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20211103204646/graph1-300x300.png" alt=""></a>











As the root doesn't have a right subtree, the right boundary is not included in the traversal.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root[] = [1, N, 2, N, 3, N, 4, N, N] 
    <span class="hljs-number">1</span>
     <span class="hljs-string">\</span>
      <span class="hljs-number">2</span>
       <span class="hljs-string">\</span>
        <span class="hljs-number">3</span>
         <span class="hljs-string">\</span>
          <span class="hljs-number">4</span>
<strong>
Output: </strong>[<span class="hljs-number">1</span>, <span class="hljs-number">4</span>, <span class="hljs-number">3</span>, <span class="hljs-number">2</span>]
<strong>Explanation:<br></strong><span class="hljs-attr">Left boundary:</span> [<span class="hljs-number">1</span>] <span class="hljs-string">(as</span> <span class="hljs-string">there</span> <span class="hljs-string">is</span> <span class="hljs-literal">no</span> <span class="hljs-string">left</span> <span class="hljs-string">subtree)</span>
<span class="hljs-attr">Leaf nodes:</span> [<span class="hljs-number">4</span>]
<span class="hljs-attr">Right boundary:</span> [<span class="hljs-number">3</span>, <span class="hljs-number">2</span>] <span class="hljs-string">(in</span> <span class="hljs-string">reverse</span> <span class="hljs-string">order)</span>
<span class="hljs-attr">Final traversal:</span> [<span class="hljs-number">1</span>, <span class="hljs-number">4</span>, <span class="hljs-number">3</span>, <span class="hljs-number">2</span>]</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 ≤ number of nodes ≤ 10<sup>5</sup></span><br><span style="font-size: 14pt;">1 ≤ node-&gt;data ≤ 10<sup>5</sup></span></p></div>


<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Tree" target="_blank" class="ui label problems_tag_label__A4Ism">Tree</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>


<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(h)</div></div></div></div>