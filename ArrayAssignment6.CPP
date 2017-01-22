/* problem:Write a program to find duplicate element element in an integer array?
   please tell me java equivalent of this , 
   input: 10 integer values
   output: each element with its no. of times occured adjacent to it */
#include <iostream>

using namespace std;
struct MyList{
    int value;
    int occurence=1;
    struct MyList* next=NULL;
};
struct MyList* duplicate(struct MyList* head,int v){
    struct MyList* item= new struct MyList;
    MyList* temp=head;
    item->value= v;
    item->next= NULL;
    if(temp==NULL){
        return item;
    }
    else{
        while(1){
            if(temp->value==v){
                temp->occurence++;
                break;
            }
            if(temp->next==NULL){
                temp->next=item;
                break;
            }
            temp=temp->next;
        }
    }
return head;
}
void display(struct MyList* head){
    while(head!=NULL){
        cout<<head->value<<"  "<<head->occurence<<endl;
        head=head->next;
    }
}
int main()
{
    int arr[10];
    MyList *head=NULL;
    for(int i=0; i<10; i++)
        cin>>arr[i];
    for(int i=0; i<10; i++){
        head=duplicate(head,arr[i]);
    }
    display(head);
    return 0;
}

