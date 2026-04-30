#include<iostream>
using namespace std;



class node{
    public:
       int value;
       node* next;

       node(int val){
        this->value=val;
        next=NULL;
       }

};

node* cyclenode(node* head){
    node* slow=head;
    node* fast=head;
    bool isCycle=false;


    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            isCycle=true;
            break;
        }
    }
    if(!isCycle) return NULL;

    slow=head;

    while(slow!=fast){
        slow=slow->next;
        fast=fast->next;
    }
    return slow;
}



int main(){
    // Creating nodes
    node* head = new node(1);
    node* second = new node(2);
    node* third = new node(3);
    node* fourth = new node(4);

    // Linking nodes
    head->next = second;
    second->next = third;
    third->next = fourth;

    //  Creating a cycle
    fourth->next = second;

    node* cycnode=cyclenode(head);

    cout<<"the cycle node is "<<cycnode->value<<endl;
    return 0;

}