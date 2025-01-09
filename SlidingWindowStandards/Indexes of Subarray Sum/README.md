# Indexes of Subarray Sum
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an array <strong>arr[]</strong> containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value <strong><code>target</code></strong>. You need to return the <strong>1-based indices</strong> of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.</span></p>
<p><span style="font-size: 14pt;">Note: If no such array is possible then, return [-1].</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 7, 5], target = 12
<strong>Output: </strong>[2, 4]<strong>
Explanation: </strong>The sum of elements from 2nd to 4th position is 12.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
<strong>Output: </strong>[1, 5]<strong>
Explanation: </strong>The sum of elements from 1st to 5th position is 15.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [5, 3, 4], target = 2
<strong>Output: </strong>[-1]<strong>
Explanation: </strong>There is no subarray with sum 2.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1 &lt;= arr.size()&lt;= 10<sup>6<br></sup>0 &lt;= arr[i] &lt;= 10<sup>3</sup></span><br><span style="font-size: 14pt;">0 &lt;=&nbsp;</span><span style="font-size: 14pt;">target</span><span style="font-size: 14pt;"> &lt;= 10<sup>9</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=prefix-sum" target="_blank" class="ui label problems_tag_label__A4Ism">prefix-sum</a><a href="/explore?category[]=Searching" target="_blank" class="ui label problems_tag_label__A4Ism">Searching</a><a href="/explore?category[]=sliding-window" target="_blank" class="ui label problems_tag_label__A4Ism">sliding-window</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>