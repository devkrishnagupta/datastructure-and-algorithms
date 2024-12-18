# Allocate Minimum Pages
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given an array <code>arr[]</code> of integers, where each element <code>arr[i]</code> represents the number of pages in the ith book. You also have an integer <code>k</code> representing the number of students. The task is to allocate books to each student such that:</span></p>
<ul>
<li><span style="font-size: 14pt;">Each student receives <strong>atleast</strong> one book.</span></li>
<li><span style="font-size: 14pt;">Each student is assigned a contiguous sequence of books.</span></li>
<li><span style="font-size: 14pt;">No book is assigned to more than one student.</span></li>
</ul>
<p><span style="font-size: 14pt;">The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>: Return <strong>-1</strong> if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [12, 34, 67, 90], k = 2
<strong>Output: </strong>113
<strong>Explanation: </strong>Allocation can be done in following ways:
[12] and [34, 67, 90] Maximum Pages = 191
[12, 34] and [67, 90] Maximum Pages = 157
[12, 34, 67] and [90] Maximum Pages = 113.
Therefore, the minimum of these cases is 113, which is selected as the output.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [15, 17, 20], k = 5
<strong>Output: </strong>-1
<strong>Explanation: </strong>Allocation can not be done.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [22, 23, 67], k = 1
<strong>Output: </strong>112</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;=&nbsp; arr.size() &lt;= 10<sup>6</sup><br>1 &lt;= arr[i] &lt;= 10<sup>3<br></sup></span><span style="font-size: 18px;">1 &lt;= k &lt;= 10<sup>3&nbsp;</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Searching" target="_blank" class="ui label problems_tag_label__A4Ism">Searching</a><a href="/explore?category[]=Divide and Conquer" target="_blank" class="ui label problems_tag_label__A4Ism">Divide and Conquer</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>