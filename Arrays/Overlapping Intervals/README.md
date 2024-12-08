# Overlapping Intervals
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array<strong>&nbsp;</strong>of Intervals <strong>arr[][]</strong>, where <strong>arr[i] = [start<sub>i</sub>, end<sub>i</sub>]. </strong>The task is to merge all of the <strong>overlapping Intervals</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr</span><span style="font-size: 18px;">[][]</span><span style="font-size: 18px;"> = [[1,3],[2,4],[6,8],[9,10]]
<strong>Output: </strong>[[1,4], [6,8], [9,10]]<strong>
Explanation: </strong>In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[][] = [[6,8],[1,9],[2,4],[4,7]]
<strong>Output: </strong>[[1,9]]<br><strong>Explanation: </strong>In the given intervals all the intervals overlap with the interval [1,9]. Therefore we will return [1,9].<br></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>0 ≤ start<sub>i</sub> ≤ end<sub>i</sub> ≤ 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>