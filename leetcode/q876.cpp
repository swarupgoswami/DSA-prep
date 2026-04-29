#include<iostream>
using namespace std;



class node{
    public:
      int data;
      node* next;

      node(int val){
        this->data=val;
        next=NULL;
      }
};

node* middleofthelinkedlist(node* head){
    node* slow=head;
    node* fast=head;

    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    return slow;
}



int main(){
      node* head = new node(1);
    head->next = new node(2);
    head->next->next = new node(3);
    head->next->next->next = new node(4);
    head->next->next->next->next = new node(5);

    node* mid = middleofthelinkedlist(head);

    cout << "Middle element: " << mid->data << endl;

    return 0;
}
