package stackandqueue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();		//pop() stack클래스의 메소드 스택의 맨 위 객체를 가져온다. 제거함
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			
		}
		
		
		/*
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.peek();		//peek() stack클래스의 메소드. 스택의 맨 위 객체를 가져온다. 제거하지않음
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			
		}
		*/
	}

}
