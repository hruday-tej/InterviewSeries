class Solution {
public:
    set<ListNode*> S;
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        while(headA!=NULL)
        {
            S.insert(headA);
            headA=headA->next;
        }
        while(headB!=NULL)
        {
            if(S.find(headB)!=S.end())
            {
                return headB;
            }
            headB=headB->next;
        }
        return headB;
    }
};
