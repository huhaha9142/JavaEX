package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//	스택 생성
		//	LIFO(Last Input First Output)
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < 5; i++) {
			stack.push(i);	//	데이터 입력
			System.out.println("STACK:" + stack);
		}

		//	가장 위쪽 데이터 확인

//		while(true) {
		while(!stack.empty()) {
			System.out.println("POP:" + stack.pop());	
			//	가장 마지막 입력 데이터 추출
			System.out.println("Stack:" + stack);
		}
	}

}
