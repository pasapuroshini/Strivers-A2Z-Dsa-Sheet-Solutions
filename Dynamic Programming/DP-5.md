#Maximum Sum of Non adjacent Elements





**Lets try out all subsequences with the given constraint

#Intuition

Now pick the one with maximum sum
Printing all subsequences - Using Recursion**
1) Express every recursion in terms of index
2)Do stuffs possible on that index
3)Return best


**Step-1:Recursive PseudoCode**


f(ind,arr[])
{
if(ind==0)return arr[ind]
if(ind<0) return 0
pick= arr[ind]+f(ind-2,arr)
notPick=0+f(ind-1,arr)
return max(pick,notPick)
}

**Memoization Approach**
Code in java :



