# Largest subarray of 0's and 1's
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr</strong> of 0s and 1s. Find and return the length of the <strong>longest</strong> subarray with <strong>equal</strong> number of 0s and 1s.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 0, 1, 1, 1, 0, 0]
<strong>Output: </strong>6<strong>
Explanation: </strong>arr[1...6] is the longest subarray with three 0s and three 1s.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [0, 0, 1, 1, 0]
<strong>Output: </strong>4<br><strong>Explnation: </strong>arr[0...3] or arr[1...4] is the longest subarray with two 0s and two 1s.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [0]
<strong>Output: </strong>0<br><strong>Explnation: </strong>There is no subarray with an equal number of 0s and 1s.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>5</sup><br>0 &lt;= arr[i] &lt;= 1</span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=sliding-window" target="_blank" class="ui label problems_tag_label__A4Ism">sliding-window</a><a href="/explore?category[]=Hash" target="_blank" class="ui label problems_tag_label__A4Ism">Hash</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>