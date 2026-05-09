#include<iostream>
using namespace std ;



class node{
    public:
      int value;
      node* next;

      node(int val){
        this->value=val;
        next=NULL;
      }
};

node* intersectionnode(node* headA,node* headB){
    node* a=headA;
    node* b=headB;

    while(a!=b){
        a=(a==NULL)?headB:a->next;
        b=(b==NULL)?headA:b->next;
    }
    return a;
}


int main(){
     // Common intersected part
    node* common = new node(8);
    common->next = new node(10);

    // List A
    node* headA = new node(1);
    headA->next = new node(2);
    headA->next->next = new node(3);
    headA->next->next->next = common;

    // List B
    node* headB = new node(4);
    headB->next = new node(5);
    headB->next->next = common;

    // Calling function
    node* ans = intersectionnode(headA, headB);

    if(ans != NULL){
        cout << "Intersection Node Value: " << ans->value;
    }
    else{
        cout << "No Intersection";
    }

}