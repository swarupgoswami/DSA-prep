#include<iostream>
#include<list>
using namespace std;

class node {
public:
    int data;
    node* next;

    node(int val) {
        data = val;
        next = NULL;
    }
};



bool iscycleinlinkedlist(node* head){
    node* slow=head;
    node* fast=head;

    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;

        if(slow==fast){
            return true;
        }
    }
    return false;
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
    fourth->next = second;   // cycle starts at node with value 2

    // Check cycle
    if(iscycleinlinkedlist(head)){
        cout << "Cycle detected\n";
    } else {
        cout << "No cycle\n";
    }


}