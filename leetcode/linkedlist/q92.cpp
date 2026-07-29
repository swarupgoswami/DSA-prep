#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node* next;

    Node(int val)
    {
        data = val;
        next = NULL;
    }
};

void printList(Node* head)
{
    while(head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
}

int main()
{
    // Creating the linked list
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    int left = 2;
    int right = 4;

    if(head == NULL || left == right)
    {
        printList(head);
        return 0;
    }

    Node* prev = NULL;
    Node* curr = head;

    // Move curr to the left position
    for(int i = 1; i < left; i++)
    {
        prev = curr;
        curr = curr->next;
    }

    // Store the important pointers
    Node* connection = prev;
    Node* tail = curr;

    // Reverse the required part
    prev = NULL;

    for(int i = 0; i < right - left + 1; i++)
    {
        Node* nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }

    // Connect first part
    if(connection != NULL)
        connection->next = prev;
    else
        head = prev;

    // Connect last part
    tail->next = curr;

    printList(head);

    return 0;
}