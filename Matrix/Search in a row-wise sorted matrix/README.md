# Search in a row-wise sorted matrix
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a row-wise sorted 2D matrix <strong>mat</strong>[][] of size <strong>n x m&nbsp;</strong>and<strong>&nbsp;</strong>an integer <strong>x,</strong> find whether element <strong>x</strong> is present in the matrix.<br>Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] &lt;= mat[i][j+1].</span><br style="font-size: 18px;"><br><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
<strong>Output</strong>: true
<strong>Explanation</strong>: 9 is present in the matrix, so the output is true.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: mat[][] = [[19, 22, 27, 38, 55, 67]], x = 56<br><strong>Output</strong>: false
<strong>Explanation</strong>: 56 is not present in the matrix, so the output is false.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: mat[][] = [[1, 2, 9],[65, 69, 75]], x = 91</span><br><span style="font-size: 14pt;"><strong>Output</strong>: false
<strong>Explanation</strong>: 91 is not present in the matrix.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1 &lt;= n, m &lt;= 1000<br>1 &lt;= mat[i][j] &lt;= 10<sup>5</sup><br>1 &lt;= x &lt;= 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Binary Search" target="_blank" class="ui label problems_tag_label__A4Ism">Binary Search</a><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore?category[]=Matrix" target="_blank" class="ui label problems_tag_label__A4Ism">Matrix</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log m)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>