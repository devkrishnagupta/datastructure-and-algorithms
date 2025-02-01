# Word Search
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given a <strong>two-dimensional</strong> <strong>mat[][]</strong> of <strong>size n*m</strong> containing English alphabets and a string <strong>word</strong>. Check if the word exists on the mat. The word can be constructed by using letters from <strong>adjacent</strong> cells, either horizontally or vertically. The same cell cannot be used more than <strong>once</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"
<strong>Output: </strong>true
<strong>Explanation:</strong>
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886266/Web/Other/blobid4_1737981964.png" alt="" width="220" height="200"><br>The letter cells which are used to construct the "GEEK" are colored.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [['T', 'E', 'U'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"
<strong>Output: </strong>false
<strong>Explanation:</strong>
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886266/Web/Other/blobid5_1737981964.png" alt="" width="220" height="199"><br>It is impossible to construct the string word from the mat using each cell only once.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [['A', 'B', 'A'], ['B', 'A', 'B']], word = "AB"
<strong>Output: </strong>true
<strong>Explanation:</strong>
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886266/Web/Other/blobid6_1737981964.png" alt="" width="222" height="184"><br>There are multiple ways to construct the word "AB".</span></pre>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Constraints:</strong><br><span style="font-size: 14pt;">1 ≤ n, m ≤ 6</span><br><span style="font-size: 14pt;">1 ≤ L ≤ 15</span><br><span style="font-size: 18.6667px;">mat and word consists of only lowercase and uppercase English letters.</span></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Recursion" target="_blank" class="ui label problems_tag_label__A4Ism">Recursion</a><a href="/explore?category[]=DFS" target="_blank" class="ui label problems_tag_label__A4Ism">DFS</a><a href="/explore?category[]=Graph" target="_blank" class="ui label problems_tag_label__A4Ism">Graph</a><a href="/explore?category[]=Backtracking" target="_blank" class="ui label problems_tag_label__A4Ism">Backtracking</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n * m * 3^L)</div><div target="_blank" class="ui label">Auxiliary Space: O(n * m)</div></div></div></div>