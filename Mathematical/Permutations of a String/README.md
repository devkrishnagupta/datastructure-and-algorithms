# Permutations of a String
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18.6667px;">Given a string <strong>s</strong>, which may contain duplicate characters, your task is to generate and return an array of all <strong>unique </strong>permutations of the string. You can return your answer in <strong>any </strong>order.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "ABC"
<strong>Output: </strong>["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
<strong>Explanation: </strong>Given string ABC has 6 unique permutations.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "ABSG"
<strong>Output: </strong>["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]
<strong>Explanation: </strong>Given string ABSG has 24 unique permutations.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s =<strong> </strong>"AAA"
<strong>Output: </strong>["AAA"]<br></span><strong style="font-size: 14pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong><span style="font-family: -apple-system, system-ui, Segoe UI, Roboto, Oxygen, Ubuntu, Cantarell, Open Sans, Helvetica Neue, sans-serif;"><span style="font-size: 18.6667px;">No other unique permutations can be formed as all the characters are same.</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= s.size() &lt;= 9<br>s contains only Uppercase english alphabets</span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Strings" target="_blank" class="ui label problems_tag_label__A4Ism">Strings</a><a href="/explore?category[]=Recursion" target="_blank" class="ui label problems_tag_label__A4Ism">Recursion</a><a href="/explore?category[]=Backtracking" target="_blank" class="ui label problems_tag_label__A4Ism">Backtracking</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n! * n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>