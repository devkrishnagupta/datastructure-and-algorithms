# Count distinct elements in every window
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer array <strong>arr[]</strong>&nbsp;and a number <strong>k</strong>. Find the count of distinct elements in every window of size <strong>k</strong> in the array.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input:</span></strong><span style="font-size: 18px;"> arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
<strong>Output:  </strong>[3, 4, 4, 3]<strong>
Explanation: </strong>Window 1 of size k = 4 is 1 2 1 3. Number of distinct elements in this window are 3.&nbsp;
Window 2 of size k = 4 is 2 1 3 4. </span><span style="font-size: 18px;">Number of distinct elements in this window are 4.</span>
<span style="font-size: 18px;">Window 3&nbsp;of size k = 4 is&nbsp;1 3 4 2.&nbsp;</span><span style="font-size: 18px;">Number of distinct elements in this window are 4.</span>
<span style="font-size: 18px;">Window 4&nbsp;of size k = 4 is&nbsp;</span><span style="font-size: 18px;">3 4 2 3. Number of distinct elements in this window are 3.</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[] = [4, 1, 1], k = 2
<strong>Output: </strong>[2, 1]<br><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Window 1 of size k = 2 is 4 1. Number of distinct elements in this window are 2. <br></span>Window 2 of size k = 2 is 1 1. <span style="font-size: 18px;">Number of distinct elements in this window is 1. </span></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 1, 1, 1, 1], k = 3
<strong>Output: </strong>[1, 1, 1]</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;= k &lt;= arr.size() &lt;= 10<sup>5</sup></span><br><span style="font-size: 18px;">1 &lt;= arr[i] &lt;= 10<sup>5</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=sliding-window" target="_blank" class="ui label problems_tag_label__A4Ism">sliding-window</a><a href="/explore?category[]=Hash" target="_blank" class="ui label problems_tag_label__A4Ism">Hash</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>