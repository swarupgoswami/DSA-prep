#include<iostream>
using namespace std;

class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;

    Node(int _val) {
        val = _val;
        prev = NULL;
        next = NULL;
        child = NULL;
    }
};

class Solution {
public:

    Node* flattenDFS(Node* head) {
        Node* current = head;
        Node* last = head;

        while (current != NULL) {
            Node* nextNode = current->next;

            if (current->child != NULL) {
                Node* childHead = current->child;

                Node* childTail = flattenDFS(childHead);

                // connect current -> child
                current->next = childHead;
                childHead->prev = current;
                current->child = NULL;

                // connect child tail -> nextNode
                if (nextNode != NULL) {
                    childTail->next = nextNode;
                    nextNode->prev = childTail;
                }

                last = childTail;
            } 
            else {
                last = current;
            }

            current = nextNode;
        }

        return last;
    }

    Node* flatten(Node* head) {
        if (head == NULL) return NULL;
        flattenDFS(head);
        return head;
    }
};

int main() {

    // Creating nodes
    Node* n1 = new Node(1);
    Node* n2 = new Node(2);
    Node* n3 = new Node(3);
    Node* n4 = new Node(4);
    Node* n5 = new Node(5);
    Node* n6 = new Node(6);

    // Main list: 1-2-3-4
    n1->next = n2;
    n2->prev = n1;

    n2->next = n3;
    n3->prev = n2;

    n3->next = n4;
    n4->prev = n3;

    // Child list: 5-6 attached to node 3
    n3->child = n5;

    n5->next = n6;
    n6->prev = n5;

    // Flatten
    Solution obj;
    Node* head = obj.flatten(n1);

    // Print flattened list
    Node* temp = head;
    cout << "Flattened List: ";
    while (temp != NULL) {
        cout << temp->val << " ";
        temp = temp->next;
    }

    return 0;
}