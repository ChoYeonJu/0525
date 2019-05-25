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
			Coin coin = coinBox.pop();		//pop() stackŬ������ �޼ҵ� ������ �� �� ��ü�� �����´�. ������
			System.out.println("������ ���� : " + coin.getValue() + "��");
			
		}
		
		
		/*
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.peek();		//peek() stackŬ������ �޼ҵ�. ������ �� �� ��ü�� �����´�. ������������
			System.out.println("������ ���� : " + coin.getValue() + "��");
			
		}
		*/
	}

}
