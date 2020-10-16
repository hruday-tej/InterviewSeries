class Solution {
public:
    set<ListNode*> S;
    bool hasCycle(ListNode *head) {
        ListNode* s=head;
        ListNode* f=head;
        if(head==NULL || head->next==NULL)
        {
            return false;
        }
        while(f->next!=NULL && f->next->next!=NULL)
        {
            s=s->next;
            f=f->next->next;
            if(s==f)
            {
                return true;
            }
            
        }
        return false;
    }
};
