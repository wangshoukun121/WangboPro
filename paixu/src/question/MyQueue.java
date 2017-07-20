/*
 * 用两个栈实现队列
 */
package question;

import java.util.Scanner;
import java.util.Stack;

public class MyQueue {
private Stack<Integer> spush=new Stack<Integer>();
private Stack<Integer> spop=new Stack<Integer>();
public MyQueue(){
	this.spop=new Stack<Integer>();
	this.spush=new Stack<Integer>();
}
public void add(int NewNum){
	this.spush.push(NewNum);
}
public int poll(){
	if(this.spop.isEmpty()){
		while(!this.spush.isEmpty()){
		this.spop.push(this.spush.pop());
		}
	}
	else if(!this.spush.isEmpty())
		throw new RuntimeException("make sure the queue is empty!");
	return this.spop.pop();
}
public int peek(){
	if(this.spop.isEmpty())
		throw new RuntimeException("the queue is empty! ");
	else
		return this.spop.peek();
}
public boolean isEmpty(){
	if(this.spop.isEmpty()&&this.spush.isEmpty())
		return true;
	else
		return false;
}
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	MyQueue q=new MyQueue();
	while(in.hasNextInt()){
		q.add(in.nextInt());
	}
	while(!q.isEmpty()){
		
		System.out.println(q.poll());
	}
	
}
}
