# Merge Without Extra Space
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two sorted arrays <strong>a[]</strong> and <strong>b[] </strong>of size <strong>n </strong>and <strong>m </strong>respectively, the task is to merge them in sorted order without using any <strong>extra space</strong>. Modify <strong>a[]</strong> so that it contains the first <strong>n</strong> elements and modify <strong>b[]</strong> so that it contains the last <strong>m</strong> elements.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a[] = [2, 4, 7, 10], b[] = [2, 3]
<strong>Output</strong>:<br>2 2 3 4<br>7 10
<strong>Explanation</strong>: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
<strong>Output</strong>:<br>1 2 3 5 8 9<br>10 13 15 20
<strong>Explanation</strong>: After merging two sorted arrays we get 5 10 12 18 20.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a[] = [0, 1], b[] = [2, 3]
<strong>Output</strong>:<br>0 1<br>2 3
<strong>Explanation</strong>: After merging two sorted arrays we get 0 1 2 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;= a.size(), b.size() &lt;= 10<sup>5</sup><br>0 &lt;= a[i], b[i]&nbsp;&lt;= 10<sup>7</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log m)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>