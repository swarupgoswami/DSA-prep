#include <iostream>
#include <vector>
using namespace std;

class Node
{
public:
    int data;   // each node contains data
    Node *next; // and a pointer that sores the memeory address of the next node do Node* type

    Node(int val)
    {
        this->data = val;
        next = NULL;
    }
};

class list
{
    Node *head;
    Node *tail;

public:
    list()
    {
        head = tail = NULL;
    }

    void push_front(int val)
    {
        Node *newnode = new Node(val); // this line creates the a node in heap (dynamic) and making the newnode pointer point to it
        if (head == NULL)
        {
            head = tail = newnode;
        }
        else
        {
            newnode->next = head;
            head = newnode;
        }
    }

    void print()
    {
        Node *temp = head;

        while (temp != NULL)
        {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
};

int main()
{
    list l;
    l.push_front(1);
    l.print();
    return 0;
}