# Kth Largest in a Stream
## Medium
<div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given an input stream <strong>arr[] </strong>of <strong>n</strong> integers. Find the <strong>K</strong><sup>th</sup> <strong>largest </strong>element (not <strong>K</strong><sup>th</sup> largest unique element) after insertion of each element in the stream and if the <strong>K<sup>th</sup></strong> largest element doesn't exist, the answer will be -1 for that insertion.&nbsp; </span></p>
<p><span style="font-size: 14pt;">Return a list of size n, where each element represents the Kth largest value after the corresponding insertion.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[]<strong> </strong>=<strong> </strong>[1, 2, 3, 4, 5, 6], k = 4
<strong>Output: </strong>[-1, -1, -1, 1, 2, 3]
<strong>Explanation: </strong></span><span style="font-size: 18px;"><span style="font-size: 14pt;"><span style="font-size: 14pt;"><br></span></span></span><span style="font-size: 18.6667px; text-wrap-mode: nowrap;">After 1, the steam is [1]. The 4th largest does not exist. Output is -1.
After 2, the stream is [1, 2]. The 4th largest does not exist. Output is -1.
After 3, the stream is [1, 2, 3]. The 4th largest does not exist. Output is -1.
After 4, the stream is [1, 2, 3, 4]. The 4th largest is 1.
After 5, the stream is [1, 2, 3, 4, 5]. The 4th largest is 2.
After 6, the stream is [1, 2, 3, 4, 5, 6]. The 4th largest is 3.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [3, 2, 1, 3, 3], k = 2
<strong>Output: </strong>[-1, 2, 2, 3, 3]
<strong>Explanation:</strong> 
After 3, the steam is [3]. Tthe 2nd largest does not exist. Output is -1.<br>After 2, the stream is [3, 2]. The 2nd largest is 2.<br>After 1, the stream is [3, 2, 1]. The 2nd largest is 2.<br>After 3, the stream is [3, 2, 1, 3]. The 2nd largest is 3.<br>After 3, the stream is [3, 2, 1, 3, 3]. The 2nd largest is 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ k ≤ n ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF"><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular button problems_tag_dropdown__x6C2I problems_rotate__oQqED"><img src="https://media.geeksforgeeks.org/img-practice/prod/teams/45678/Web/Menu/Vector%20(1)_1776855167.png" alt="Dropdown Icon"></button></div></div><div class="content active animated_content open"><div class="ui labels"><a href="/explore?category[]=Heap" target="_blank" class="ui label problems_tag_label__A4Ism">Heap</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>
