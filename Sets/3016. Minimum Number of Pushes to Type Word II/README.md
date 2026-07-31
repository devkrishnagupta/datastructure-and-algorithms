# 3016. Minimum Number of Pushes to Type Word II
## Medium
<div class="HTMLContent_html__0OZLp" data-track-load="description_content"><p>You are given a string <code>word</code> containing lowercase English letters.</p>

<p>Telephone keypads have keys mapped with <strong>distinct</strong> collections of lowercase English letters, which can be used to form words by pushing them. For example, the key <code>2</code> is mapped with <code>["a","b","c"]</code>, we need to push the key one time to type <code>"a"</code>, two times to type <code>"b"</code>, and three times to type <code>"c"</code> <em>.</em></p>

<p>It is allowed to remap the keys numbered <code>2</code> to <code>9</code> to <strong>distinct</strong> collections of letters. The keys can be remapped to <strong>any</strong> amount of letters, but each letter <strong>must</strong> be mapped to <strong>exactly</strong> one key. You need to find the <strong>minimum</strong> number of times the keys will be pushed to type the string <code>word</code>.</p>

<p>Return <em>the <strong>minimum</strong> number of pushes needed to type </em><code>word</code> <em>after remapping the keys</em>.</p>

<p>An example mapping of letters to keys on a telephone keypad is given below. Note that <code>1</code>, <code>*</code>, <code>#</code>, and <code>0</code> do <strong>not</strong> map to any letters.</p>
<img alt="" style="width: 329px; height: 313px;" src="https://assets.leetcode.com/uploads/2023/12/26/keypaddesc.png">
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" style="width: 329px; height: 313px;" src="https://assets.leetcode.com/uploads/2023/12/26/keypadv1e1.png">
<pre><strong>Input:</strong> word = "abcde"
<strong>Output:</strong> 5
<strong>Explanation:</strong> The remapped keypad given in the image provides the minimum cost.
"a" -&gt; one push on key 2
"b" -&gt; one push on key 3
"c" -&gt; one push on key 4
"d" -&gt; one push on key 5
"e" -&gt; one push on key 6
Total cost is 1 + 1 + 1 + 1 + 1 = 5.
It can be shown that no other mapping can provide a lower cost.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" style="width: 329px; height: 313px;" src="https://assets.leetcode.com/uploads/2024/08/20/edited.png">
<pre><strong>Input:</strong> word = "xyzxyzxyzxyz"
<strong>Output:</strong> 12
<strong>Explanation:</strong> The remapped keypad given in the image provides the minimum cost.
"x" -&gt; one push on key 2
"y" -&gt; one push on key 3
"z" -&gt; one push on key 4
Total cost is 1 * 4 + 1 * 4 + 1 * 4 = 12
It can be shown that no other mapping can provide a lower cost.
Note that the key 9 is not mapped to any letter: it is not necessary to map letters to every key, but to map all the letters.
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="" style="width: 329px; height: 313px;" src="https://assets.leetcode.com/uploads/2023/12/27/keypadv2.png">
<pre><strong>Input:</strong> word = "aabbccddeeffgghhiiiiii"
<strong>Output:</strong> 24
<strong>Explanation:</strong> The remapped keypad given in the image provides the minimum cost.
"a" -&gt; one push on key 2
"b" -&gt; one push on key 3
"c" -&gt; one push on key 4
"d" -&gt; one push on key 5
"e" -&gt; one push on key 6
"f" -&gt; one push on key 7
"g" -&gt; one push on key 8
"h" -&gt; two pushes on key 9
"i" -&gt; one push on key 9
Total cost is 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 2 * 2 + 6 * 1 = 24.
It can be shown that no other mapping can provide a lower cost.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word.length &lt;= 10<sup>5</sup></code></li>
	<li><code>word</code> consists of lowercase English letters.</li>
</ul>
</div>

<div class="flex flex-col"><div class="group flex cursor-pointer items-center transition-colors text-label-2 dark:text-dark-label-2 hover:text-label-1 dark:hover:text-dark-label-1"><div class="flex-1 text-sm leading-[22px]"><div class="flex items-center gap-2 text-sd-foreground"><div class="relative text-[16px] leading-[normal] p-0.5 before:block before:h-4 before:w-4 fill-none stroke-current text-sd-foreground"><svg aria-hidden="true" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" height="1em" width="0.875em" class="svg-inline--fa fa-tag absolute h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em] left-1/2 top-1/2"><path fill="currentColor" d="M197.5 32c17 0 33.3 6.7 45.3 18.7l176 176c25 25 25 65.5 0 90.5L285.3 450.7c-25 25-65.5 25-90.5 0l-176-176C6.7 262.7 0 246.5 0 229.5V80C0 53.5 21.5 32 48 32H197.5zM48 229.5c0 4.2 1.7 8.3 4.7 11.3l176 176c6.2 6.2 16.4 6.2 22.6 0L384.8 283.3c6.2-6.2 6.2-16.4 0-22.6l-176-176c-3-3-7.1-4.7-11.3-4.7H48V229.5zM112 112a32 32 0 1 1 0 64 32 32 0 1 1 0-64z"></path></svg></div><div class="text-body text-text-primary dark:text-text-primary">Topics</div></div></div><div class="text-[24px] transition-colors text-gray-4 dark:text-dark-gray-4 group-hover:text-gray-5 dark:group-hover:text-dark-gray-5"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="origin-center transition-transform rotate-180"><path fill-rule="evenodd" d="M16.293 9.293a1 1 0 111.414 1.414l-5 5a1 1 0 01-1.414 0l-5-5a1 1 0 011.414-1.414L12 13.586l4.293-4.293z" clip-rule="evenodd"></path></svg></div></div><div style="height: auto; transition-duration: 0.25s;" class="overflow-hidden transition-all"><div class="mt-2 flex flex-wrap gap-1 pl-7"><div class="relative inline-flex gap-1 items-center justify-center bg-fill-secondary text-text-secondary text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary">Staff</div><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-current relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary" href="/tag/hash-table/">Hash Table</a><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-current relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary" href="/tag/string/">String</a><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-current relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary" href="/tag/greedy/">Greedy</a><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-current relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary" href="/tag/sorting/">Sorting</a><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-current relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary" href="/tag/counting/">Counting</a><a target="_blank" rel="noopener noreferrer" class="no-underline hover:text-current relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-text-secondary" href="/contest/weekly-contest-381/">Weekly Contest 381</a></div></div></div>