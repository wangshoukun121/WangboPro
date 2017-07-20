/*
 * 实现一个有getMin功能的栈
 */
package question;

import java.util.Scanner;
import java.util.Stack;

public class Mystack {
private Stack<Integer>stackData=new Stack<Integer>();
private Stack<Integer>stackMin=new Stack<Integer>();
public  Mystack(){
	this.stackData=new Stack<Integer>();
	this.stackMin=new Stack<Integer>();
}
public void push(int NewNum){
	this.stackData.push(NewNum);
	if(!this.stackMin.isEmpty()){
		if(NewNum<this.stackMin.peek())
		this.stackMin.push(NewNum);
	}
	else
		this.stackMin.push(NewNum);
	
}
public int pop(){
	if(this.stackData.isEmpty())
		{throw new RuntimeException("your stack is empty!");}
			int value=this.stackData.pop();
	if(value<=this.stackMin.peek()){
		this.stackMin.pop();
	}
		return value;
}
public int peek(){
	if(this.stackData.isEmpty())
		throw new RuntimeException("your stack is empty!");
	else
	return this.stackData.peek();
}
public int getMin(){
	if(this.stackMin.isEmpty())
		throw new RuntimeException("your stack is empty!");
	else
	return this.stackMin.peek();
}
public int size(){
	return this.stackData.size();
}
public boolean isEmpty(){
	if(this.stackData.isEmpty())
		return true;
	else 
		return false;
}
public static void main(String[]args){
	System.out.println("请输入栈中数字：");
	Scanner input=new Scanner(System.in);
	Stack<Integer> s=new Stack<Integer>();
	while(input.hasNextInt()){
		s.push(input.nextInt());
	}
//	while(!s.isEmpty()){
//		System.out.print(s.pop()+" ");
//	}
	//System.out.println("栈中最小值："+s.getMin());
	
	/*for(int i=0;i<5;i++){
		System.out.println(s.pop());
	}*/
	for(Integer i:s){
		System.out.println(i);
	}
}


}
