#include <iostream>
using namespace std;

class node
{
public:
    int value;
    node *next;
    node *prev; //  in doubly linked list each node has an extra pointer that points to the previous node

    node(int val)
    {
        this->value = val;
        next = NULL;
        prev = NULL;
    }
};

class doublylinkedlist
{
    node *head = NULL;
    node *tail = NULL;

public:
    void push_front(int val)
    {
        node *newnode = new node(val); // creating a node to push in the doubly linkedlist

        // if head==null means it is the first node that means doubly linked list is empty;
        if (head == NULL)
        {
            head = newnode;
            tail = newnode;
        }
        // else it is not empty
        else
        {
            newnode->next = head; // making the newnode which is pointing to the newly created node and making its next poniter to point to head node(node pointed by head)
            head->prev = newnode; // making head's prev ointer to point towards the new ly created node
            head = newnode;
        }
    }

    void print()
    {
        node *temp = head;
        while (temp != NULL)
        {
            cout << temp->value << "<=>";
            temp = temp->next;
        }
    }

    void push_back(int val)
    {
        node *newnode = new node(val);

        if (head == NULL)
        {
            head = tail = newnode;
        }
        else
        {
            newnode->prev = tail;
            tail->next = newnode;
            tail = newnode;
        }
    }

    void pop_front()
    {
        if (head == NULL)
        {
            cout << "List is empty\n";
            return;
        }

        node *temp = head;

        // case: only one node
        if (head == tail)
        {
            head = tail = NULL;
        }
        else
        {
            head = head->next;
            head->prev = NULL;
        }

        delete temp;
    }

    void pop_back()
    {
        if (head == NULL)
        {
            cout << "List is empty\n";
            return;
        }

        node *temp = tail;

        // case: only one node
        if (head == tail)
        {
            head = tail = NULL;
        }
        else
        {
            tail = tail->prev;
            tail->next = NULL;
        }

        delete temp;
    }
};

int main()
{

    doublylinkedlist dll;
    dll.push_front(1);
    dll.push_front(2);
    dll.push_front(3);
    dll.push_front(4);
    dll.push_back(4);
    dll.push_back(3);
    dll.push_back(2);
    dll.push_back(1);
    dll.print();
      cout << endl;

    dll.pop_front();   
    dll.pop_back();    

    dll.print();
    cout << endl;
    return 0;
}
