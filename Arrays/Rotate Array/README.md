# Rotate Array
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an unsorted array <em>arr[]</em><em><strong>.</strong></em>&nbsp;Rotate the array to the left (counter-clockwise direction) by<strong> </strong><em>d</em> steps, where <em>d</em> is a positive integer.&nbsp;Do the mentioned change in the&nbsp;<strong>array in place</strong>.</span></p>
<p><span style="font-size: 14pt;">Note:<strong> </strong>Consider the array as circular.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :<br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3, 4, 5], d = 2
<strong>Output: </strong>[3, 4, 5, 1, 2]
<strong>Explanation:</strong> when rotated by 2 elements, it becomes 3 4 5 1 2.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
<strong>Output: </strong>[8, 10, 12, 14, 16, 18, 20, 2, 4, 6]<strong>
Explanation: </strong>when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [7, 3, 9, 1], d = 9
<strong>Output: </strong>[3, 9, 1, 7]<strong>
Explanation: </strong>when we rotate 9 times, we'll get 3 9 1 7 as resultant array.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size(), d &lt;= 10<sup>5</sup></span><br><span style="font-size: 14pt;">0 &lt;=&nbsp;arr[i] &lt;= 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>