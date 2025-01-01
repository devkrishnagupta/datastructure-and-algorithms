# Print Anagrams Together
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.</span></p>
<p><span style="font-size: 18px;">Note: The final output will be in&nbsp;<strong>lexicographic</strong> order.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = ["act", "god", "cat", "dog", "tac"]
<strong>Output: </strong>[["act", "cat", "tac"], ["god", "dog"]]<strong>
Explanation: </strong>There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = ["no", "on", "is"]
<strong>Output: </strong>[["is"], ["no", "on"]]<strong>
Explanation: </strong>There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]<br><strong>Output</strong>: [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]<br><strong>Explanation</strong>: <br>Group 1: "abc", "bac", and "cab" are anagrams.
Group 2: "listen", "silent", and "enlist" are anagrams.
Group 3: "rat", "tar", and "art" are anagrams.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;= arr.size() &lt;=100<br></span><span style="font-size: 18px;">1&lt;= arr[i].size() &lt;=10</span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Hash" target="_blank" class="ui label problems_tag_label__A4Ism">Hash</a><a href="/explore?category[]=Strings" target="_blank" class="ui label problems_tag_label__A4Ism">Strings</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n^2 log k)</div><div target="_blank" class="ui label">Auxiliary Space: O(n * m)</div></div></div></div>