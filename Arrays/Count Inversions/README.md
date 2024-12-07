# Count Inversions
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an array of integers <strong>arr[]</strong>. Find the <strong>Inversion Count</strong> in the array.<br>T</span><span style="font-size: 14pt;">wo elements arr[i] and arr[j] form an inversion if <strong>arr[i] &gt; arr[j]</strong> and <strong>i &lt; j</strong>.</span></p>
<blockquote>
<p><span style="font-size: 14pt;"><em><strong>Inversion Count</strong>: </em>For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0. <br>If an array is sorted in the reverse order then the inversion count is the maximum.&nbsp;</span></p>
</blockquote>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: arr[] = [2, 4, 1, 3, 5]<br><strong>Output</strong>: 3
<strong>Explanation</strong>: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: arr[] = [2, 3, 4, 5, 6]<br><strong>Output</strong>: 0
<strong>Explanation</strong>: As the sequence is already sorted so there is no inversion count.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: arr[] = [10, 10, 10]<br><strong>Output</strong>: 0
<strong>Explanation</strong>: As all the elements of array are same, so there is no inversion count.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 ≤ arr.size()</span><span style="font-size: 14pt;">&nbsp;≤ 10</span><sup>5<br></sup><span style="font-size: 14pt;">1 ≤ </span><span style="font-size: 18.6667px;">arr[i]</span><span style="font-size: 14pt;"> ≤ 10</span><sup>4</sup><sup><br></sup></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>