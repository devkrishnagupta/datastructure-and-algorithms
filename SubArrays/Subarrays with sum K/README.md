# Subarrays with sum K
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number <strong>k</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong><strong> </strong>arr = [10, 2, -2, -20, 10], k = -10
<strong>Output:</strong> 3
<strong>Explaination:</strong> Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr = [9, 4, 20, 3, 10, 5], k = 33
<strong>Output:</strong> 2
<strong>Explaination:</strong> Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [1, 3, 5], k = 0<br></span><span style="font-size: 14pt;"><strong>Output:</strong> 0
<strong>Explaination: </strong>No subarray with 0 sum.</span></pre>
<p><strong style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Constraints:</strong></p>
<ul>
<li><span style="font-size: 14pt;">1 ≤ arr.size() ≤ 10<sup>5</sup></span></li>
<li><span style="font-size: 14pt;">-10<sup>3</sup> ≤ arr[i] ≤ 10<sup>3</sup></span></li>
<li><span style="font-size: 14pt;">-10<sup>7</sup>&nbsp;≤ k&nbsp;≤ 10<sup>7</sup></span></li>
</ul></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Hash" target="_blank" class="ui label problems_tag_label__A4Ism">Hash</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>