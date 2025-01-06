# Sum Pair closest to target
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> and a number <strong>target</strong>, find a pair of elements (a, b) in <strong>arr[],&nbsp;</strong>where a&lt;=b whose sum is closest to <strong>target.</strong><br></span><strong><span style="font-size: 18px;">Note:&nbsp;</span></strong><span style="font-size: 18px;">Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [10, 30, 20, 5], target = 25
<strong>Output:</strong> [5, 20]
<strong>Explanation:</strong> As 5 + 20 = 25 is closest to 25.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [5, 2, 7, 1, 4], target = 10
<strong>Output:</strong> [2, 7]
<strong>Explanation:</strong> As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. </span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [10], target = 10
<strong>Output:</strong> []
<strong>Explanation:</strong> As the input array has only 1 element, return an empty array.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 2*10<sup>5</sup><br>0 &lt;= target&lt;= 2*10<sup>5</sup><br>0 &lt;= arr[i] &lt;= 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=two-pointer-algorithm" target="_blank" class="ui label problems_tag_label__A4Ism">two-pointer-algorithm</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>