#include<iostream>
#include<unordered_map>
using namespace std;


class node{
    public:
      int val;
      node* next;
      node* random;

      node(int val){
        this->val=val;
        next=NULL;
        random=NULL;
      }

};

node* copylistwithrandompointer(node* head){
    if(head==NULL) return NULL;

    unordered_map<node*,node*>m;
    node* newhead=new node(head->val);//createing a pointer that points to newly created node with the value of the orginal linkedlist head node value
    node* oldtemp=head->next;//created a pointer to point to the next node of head
    node* newtemp=newhead;//created a pointer to point to the newly created node also pointed by newhead pointer
    m[head]=newhead;//stroring the bothe the pointers as key and value pair

    while(oldtemp!=NULL){
        node* copynode=new node(oldtemp->val);//creating the next copied node which has same value as original linkedlist oldtemp next node;s vale
        m[oldtemp]=copynode;// stroring the node pointers in the key value pair
        newtemp->next=copynode;
        oldtemp=oldtemp->next;
        newtemp=newtemp->next;
    }

    oldtemp=head;
    newtemp=newhead;

    while(oldtemp!=NULL){
        newtemp->random=m[oldtemp->random];//creating the random pointer corresponding to the original linkedlist 
        oldtemp=oldtemp->next;
        newtemp=newtemp->next;
    }
    return newhead;
}

int main(){

     // Create nodes
    node* n1 = new node(1);
    node* n2 = new node(2);
    node* n3 = new node(3);
    node* n4 = new node(4);

    // Link next pointers: 1 -> 2 -> 3 -> 4
    n1->next = n2;
    n2->next = n3;
    n3->next = n4;

    // Assign random pointers
    n1->random = n3; // 1 -> 3
    n2->random = n1; // 2 -> 1
    n3->random = n4; // 3 -> 4
    n4->random = n2; // 4 -> 2

    node* head = n1;

    // Copy list
    node* copiedHead = copylistwithrandompointer(head);

    // Print original list
    cout << "Original list:\n";
    node* temp = head;
    while(temp != NULL){
        cout << "Val: " << temp->val;
        if(temp->random)
            cout << ", Random: " << temp->random->val;
        else
            cout << ", Random: NULL";
        cout << endl;
        temp = temp->next;
    }

    // Print copied list
    cout << "\nCopied list:\n";
    temp = copiedHead;
    while(temp != NULL){
        cout << "Val: " << temp->val;
        if(temp->random)
            cout << ", Random: " << temp->random->val;
        else
            cout << ", Random: NULL";
        cout << endl;
        temp = temp->next;
    }

    return 0;

}