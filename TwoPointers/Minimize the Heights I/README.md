# Minimize the Heights I
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given</span><span style="font-size: 18px;">&nbsp;a positive integer </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;"> and an array </span><strong style="font-size: 18px;">arr[]</strong><span style="font-size: 18px;"> denoting heights of towers</span><span style="font-size: 18px;">, you have to modify the height&nbsp;of each&nbsp;tower either by increasing or decreasing them by </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;"> only </span><strong style="font-size: 18px;">once</strong><span style="font-size: 18px;">.<br></span><span style="font-size: 18px;">Find out what could be the possible&nbsp;<strong>minimum difference</strong> of the height&nbsp;of <strong>shortest</strong> and <strong>longest</strong> towers after you have modified each tower.<br></span></p>
<p><span style="font-size: 18px;">Note:<strong> </strong></span><span style="font-size: 18px;">A slight modification of the problem can be found <a href="https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1">here</a>.&nbsp;<br><br></span><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, arr[] = [1, 5, 8, 10]
<strong>Output: </strong>5
<strong>Explanation: </strong>The array can be modified as [3, 3, 6, 8]. The difference between the largest and the smallest is 8 - 3 = 5.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 3, arr[] = [3, 9, 12, 16, 20]
<strong>Output: </strong>11
<strong>Explanation: </strong>The array can be modified as [6, 12, 9, 13, 17]. The difference between the largest and the smallest is 17 - 6 = 11.&nbsp;
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints</strong><br>1 ≤ k ≤ 10<sup>4</sup><br>1 ≤ number of towers ≤ 10<sup>5</sup><br>0 ≤ arr[i] ≤ 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>