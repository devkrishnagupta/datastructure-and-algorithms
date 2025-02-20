# Find median in a stream
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a data stream&nbsp;<strong>arr[]</strong>&nbsp;where integers are read sequentially,</span><span style="font-size: 18px;">&nbsp;</span><span style="font-size: 18px;">the task is to determine the median of the elements encountered so far after each new integer is read.</span></p>
<p><span style="font-size: 18px;">There are two cases for median on the basis of data set size.</span></p>
<p><span style="font-size: 18px;">1. If the data set has an odd number then the <strong>middle </strong>one will be consider as median.<br></span><span style="font-size: 18px;">2. If the data set has an even number then there is no distinct middle value and the median will be the <strong>arithmetic mean of the two</strong> middle values.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:  </strong>arr[] = [5, 15, 1, 3, 2, 8]<strong>
Output: </strong>[5.0, 10.0, 5.0, 4.0, 3.0, 4.0] <strong>
Explanation: 
</strong>After reading 1st element of stream – 5 -&gt; median = 5.0
After reading 2nd element of stream – 5, 15 -&gt; median = (5+15)/2 = 10.0 
After reading 3rd element of stream – 5, 15, 1 -&gt; median = 5.0
After reading 4th element of stream – 5, 15, 1, 3 -&gt;  median = (3+5)/2 = 4.0
After reading 5th element of stream – 5, 15, 1, 3, 2 -&gt; median = 3.0
After reading 6th element of stream – 5, 15, 1, 3, 2, 8 -&gt;  median = (3+5)/2 = 4.0</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 2, 2, 2]</span><br><span style="font-size: 18px;"><strong>Output: </strong>[2.0, 2.0, 2.0, 2.0]</span><br><span style="font-size: 18px;"><strong>Explanation: </strong></span><br><span style="font-size: 18px;">After reading 1st element of stream – 2 -&gt; median = 2.0</span><br><span style="font-size: 18px;">After reading 2nd element of stream – 2, 2 -&gt; median = (2+2)/2 = 2.0</span><br><span style="font-size: 18px;">After reading 3rd element of stream – 2, 2, 2 -&gt; median = 2.0</span><br><span style="font-size: 18px;">After reading 4th element of stream – 2, 2, 2, 2 -&gt;&nbsp; median = (2+2)/2 = 2.0</span></pre>
<div><span style="font-size: 18px;"><strong>Constraints:</strong></span></div>
<div><span style="font-size: 18px;">1<strong>&nbsp;</strong>&lt;= arr.size() &lt;= 10<sup>5</sup></span><br><span style="font-size: 18px;">1 &lt;= x &lt;= 10<sup>6</sup></span></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Heap" target="_blank" class="ui label problems_tag_label__A4Ism">Heap</a><a href="/explore?category[]=Design-Pattern" target="_blank" class="ui label problems_tag_label__A4Ism">Design-Pattern</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>