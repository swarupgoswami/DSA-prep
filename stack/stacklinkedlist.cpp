#include<iostream>
#include<list>
using namespace std;


class stack{
    list<int>ll;

    public:
      void push(int val){
        ll.push_front(val);
      };

      void pop(){
        ll.pop_front();
      }

      int top(){
        return ll.front();
      }

};

int main(){

    stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.pop();
    cout<<s.top()<<endl;
    return 0;


}