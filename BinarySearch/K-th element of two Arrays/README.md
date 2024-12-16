# K-th element of two Arrays
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two sorted arrays <strong>a[] </strong>and <strong>b[]</strong> and an element <strong>k</strong>, the task is to find the element that would be at the <strong>k<sup>th</sup></strong> position of the combined sorted array.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
<strong>Output: </strong>6
<strong>Explanation: </strong>The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
<strong>Output: </strong>256
<strong>Explanation: </strong>Combined sorted array is [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]. The 7th element of this array is 256.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span></p>
<ul>
<li><span style="font-size: 18px;">1 &lt;= a.size(), b.size() &lt;= 10<sup>6</sup></span></li>
<li><span style="font-size: 18px;">1 &lt;= k &lt;= a.size() + b.size()</span></li>
<li><span style="font-size: 18px;">0 &lt;= a[i], b[i] &lt; 10<sup>8</sup><br></span></li>
</ul></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(log(min(a, b)))</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>