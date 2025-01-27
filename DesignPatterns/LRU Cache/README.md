# LRU Cache
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Design a data structure that works like a LRU Cache. Here&nbsp;<strong>cap</strong>&nbsp;denotes&nbsp;the capacity of the cache and&nbsp;<strong>Q</strong>&nbsp;denotes the number of queries. Query can be&nbsp;</span><span style="font-size: 18px;">of two types:</span></p>
<ol>
<li><span style="font-size: 18px;"><strong>PUT</strong>&nbsp;<strong>x</strong>&nbsp;<strong>y</strong>: sets the value of the key&nbsp;<strong>x</strong>&nbsp;with value&nbsp;<strong>y</strong></span></li>
<li><span style="font-size: 18px;"><strong>GET</strong>&nbsp;<strong>x</strong>: gets the key of&nbsp;<strong>x</strong>&nbsp;if present else returns&nbsp;<strong>-1</strong>.</span></li>
</ol>
<p><span style="font-size: 18px;">The LRUCache class has two methods&nbsp;<strong>get</strong>() and&nbsp;<strong>put</strong>() which are defined as follows.</span></p>
<ol>
<li><span style="font-size: 18px;"><strong>get(key)</strong>: returns the value of the key if it&nbsp;already exists in the cache otherwise returns&nbsp;<strong>-1.</strong></span></li>
<li><span style="font-size: 18px;"><strong>put(key, value)</strong>: if the key is already present, update its value. If not present, add the key-value pair to the cache. If the cache reaches its capacity it should remove the least recently used item before inserting the new item.</span></li>
<li><span style="font-size: 18px;">In the&nbsp;<strong>constructor</strong>&nbsp;of the class the capacity of the cache should be initialized.</span></li>
</ol>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>cap = 2, Q = 2, Queries = [["PUT", 1, 2], ["GET", 1]]
<strong>Output: </strong>[2]<strong>
Explanation: </strong>Cache Size = 2
["PUT", 1, 2] will insert the key-value pair (1, 2) in the cache,
["GET", 1] will print the value corresponding to Key 1, ie 2.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>cap = 2, Q = 8, Queries = [["PUT", 1, 2], ["PUT", 2, 3], ["PUT", 1, 5], ["PUT", 4, 5], ["PUT", 6, 7], ["GET", 4], ["PUT", 1, 2], ["GET", 3]]<br><strong>Output: </strong>[5, -1]<strong>
Explanation: </strong>Cache Size = 2
["PUT", 1, 2] will insert the pair (1,2) in the cache.
["PUT", 2, 3] will insert the pair (2,3) in the cache: 1-&gt;2, 2-&gt;3(the most recently used one is kept at the rightmost position)&nbsp;
["PUT", 1, 5] will replace the value of 1 from 2 to 5 : 2 -&gt; 3, 1 -&gt; 5
["PUT", 4, 5] : 1 -&gt; 5, 4 -&gt; 5 (Cache size is 2, hence we delete the least recently used key-value pair)
["PUT", 6, 7] : 4 -&gt; 5, 6 -&gt; 7&nbsp;
["GET", 4] : Prints 5 (The cache now looks like 6 -&gt; 7, 4-&gt;5)
["PUT", 1, 2] : 4 -&gt; 5, 1 -&gt; 2  (Cache size is 2, hence we delete the least recently used key-value pair)
["GET", 3] : No key value pair having key = 3. Hence, -1 is printed.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= cap &lt;= 10<sup>3</sup><br>1 &lt;= Q &lt;= 10<sup>5</sup><br>1 &lt;= x, y &lt;= 10<sup>4</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=doubly-linked-list" target="_blank" class="ui label problems_tag_label__A4Ism">doubly-linked-list</a><a href="/explore?category[]=Hash" target="_blank" class="ui label problems_tag_label__A4Ism">Hash</a><a href="/explore?category[]=Queue" target="_blank" class="ui label problems_tag_label__A4Ism">Queue</a><a href="/explore?category[]=Design-Pattern" target="_blank" class="ui label problems_tag_label__A4Ism">Design-Pattern</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(1) for both get() and put()</div><div target="_blank" class="ui label">Auxiliary Space: O(1) for both get() and put()</div></div></div></div>