# K Sized Subarray Maximum
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr</strong>[] and an integer <strong>k</strong>. Find the <strong>maximum </strong>for each and every contiguous subarray of size <strong>k</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 3,<strong> </strong>arr[] = [1, 2, 3, 1, 4, 5, 2, 3, 6]</span>
<span style="font-size: 18px;"><strong>Output: [</strong>3, 3, 4, 5, 5, 5, 6] </span>
<span style="font-size: 18px;"><strong>Explanation: </strong>
1st contiguous subarray = [1 2 3] max = 3
2nd contiguous subarray = [2 3 1] max = 3
3rd contiguous subarray = [3 1 4] max = 4
4th contiguous subarray = [1 4 5] max = 5
5th contiguous subarray = [4 5 2] max = 5
6th contiguous subarray = [5 2 3] max = 5
7th contiguous subarray = [2 3 6] max = 6<br><br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 4,<strong> </strong>arr[] = [8, 5, 10, 7, 9, 4, 15, 12, 90, 13]</span>
<span style="font-size: 18px;"><strong>Output: [</strong>10, 10, 10, 15, 15, 90, 90]
<strong>Explanation: 
</strong>1st contiguous subarray = [8 5 10 7], max = 10
2nd contiguous subarray = [5 10 7 9], max = 10
3rd contiguous subarray = [10 7 9 4], max = 10
4th contiguous subarray = [7 9 4 15], max = 15
5th contiguous subarray = [9 4 15 12], max = 15
6th contiguous subarray = [4 15 12 90], max = 90
7th contiguous subarray = {15 12 90 13}, max = 90</span>
</pre>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=sliding-window" target="_blank" class="ui label problems_tag_label__A4Ism">sliding-window</a><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a><a href="/explore?category[]=Queue" target="_blank" class="ui label problems_tag_label__A4Ism">Queue</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong> O(k)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ sizeof(arr) ≤ 10<sup>6</sup><br>1 ≤ k ≤ sizeof(arr)<br>0 ≤ arr[i] ≤ 10<sup>9</sup></span></p></div>

