class Solution {
public:
    string S="";
    int T=0;
    void find(string A,int c1,int c2)
    {
        int p1=c1,p2=c2,n=A.size();
        while(p1>=0 && p2<n)
        {
            if(A[p1]==A[p2])
            {
                p1--;
                p2++;
            }
            else
            {
                break;
            }
        }
        if(p2-p1-1>T)
        {
            T=p2-p1-1;
            S=A.substr(p1+1,p2-p1-1);
        }
        return;
    }
    string longestPalindrome(string str) {
        int n=str.size();
        for(int i=1;i<=n-1;i++)
        {
            if(str[i-1]==str[i+1])
            {
                find(str,i-1,i+1);
            }
            if(str[i]==str[i-1])
            {
                find(str,i-1,i);
            }   
        }
        if(S.size()==0)
        {
            char c=str[0];
            string s;
            s.push_back(c);
            return s;
        }    
        return S; 
    }
};
