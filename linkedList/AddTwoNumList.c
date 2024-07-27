
#include<stdio.h>
#include<stdlib.h>
 struct ListNode {
      int val;
     struct ListNode *next;
  };
void insert(struct ListNode **head,int data){

    struct ListNode * new_node = malloc(sizeof(struct ListNode));
    new_node->val=data;
    new_node->next=NULL;

    if(*head==NULL){
        *head = new_node;
        return;
    }

    struct ListNode * ptr = *head;
    while(ptr->next!=NULL){
        ptr=ptr->next;
    }

    ptr->next=new_node;

}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {

    struct ListNode * new_node = NULL;
    //use carry for storng the carried number
    int carry = 0;
    //if l1 or l2 is not null or if our carried number is not nul then we are adding node into the res list
    while(l1!=NULL || l2!=NULL ||carry!=0){
        //adding carry and l1 and l2 data in res
        int res =(carry+(l1!=NULL?l1->val:0)+(l2!=NULL?l2->val:0));
            // store carried number
            carry = res/10;
            // store single digit number 
            res = res%10;
            //insert the single bit in to the list
            insert(&new_node,res);
            if(l1!=NULL)
            l1=l1->next;
            if(l2!=NULL)
            l2=l2->next;
    }



    return new_node;
}