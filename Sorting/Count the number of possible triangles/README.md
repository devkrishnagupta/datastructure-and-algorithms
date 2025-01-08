# Count the number of possible triangles
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer array <strong>arr[]</strong>. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle.&nbsp;</span></p>
<blockquote>
<p><span style="font-size: 18px;">A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.</span></p>
</blockquote>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [4, 6, 3, 7]
<strong>Output</strong>: 3
<strong>Explanation</strong>: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.  <br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [10, 21, 22, 100, 101, 200, 300]
<strong>Output</strong>: 6
<strong>Explanation</strong>: There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [1, 2, 3]
<strong>Output</strong>: 0
<strong>Explanation</strong>: No triangles are possible.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>3 &lt;= arr.size() &lt;= 10<sup>3</sup></span><br><span style="font-size: 18px;">0 &lt;= arr[i] &lt;= 10</span><sup>5</sup></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore?category[]=Sorting" target="_blank" class="ui label problems_tag_label__A4Ism">Sorting</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n^2)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>