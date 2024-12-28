# Find All Triplets with Zero Sum
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array&nbsp;<strong>arr[]</strong>, find all possible indices <strong>[i, j, k]</strong> of triplets <strong>[arr[i], arr[j], arr[k]]</strong> in the array whose sum is equal to <strong>zero</strong>. Return <strong>indices</strong> of triplets in any order and all the returned triplets indices should also be <strong>internally sorted</strong>, i.e., for any triplet indices [i, j, k], the condition i &lt; j &lt; k should hold.</span></p>
<p><span style="font-size: 18px;">Note: Try to solve this using the O(n<sup>2</sup>) approach.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [0, -1, 2, -3, 1]</span><span style="font-size: 18px;">
<strong>Output: </strong>[[0, 1, 4], [2, 3, 4]]<strong>
Explanation: </strong></span><span style="font-size: 18px;">Triplets with sum 0 are:<br></span><span style="font-size: 14pt;"><span style="font-size: 18.6667px;">arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0</span></span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">arr[] = [</span><span style="font-size: 18.6667px;">1, -2, 1, 0, 5</span><span style="font-size: 14pt;">]
</span><strong style="font-size: 14pt;">Output: </strong><span style="font-size: 14pt;">[[0, 1, 2]]</span><strong style="font-size: 14pt;">
Explanation: </strong></span><span style="font-size: 18.6667px;">Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 3, 1, 0, 5]</span><span style="font-size: 18px;">
<strong>Output: </strong>[[]]</span><span style="font-size: 14pt;"><strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">There is no triplet with sum 0.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong>3 &lt;= arr.size() &lt;= 10<sup>3</sup><strong><br></strong></span><span style="font-size: 18px;">-10<sup>4</sup> &lt;= arr[i] </span><span style="font-size: 18px;">&lt;= 10<sup>4</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n^2)</div><div target="_blank" class="ui label">Auxiliary Space: O(n^2)</div></div></div></div>