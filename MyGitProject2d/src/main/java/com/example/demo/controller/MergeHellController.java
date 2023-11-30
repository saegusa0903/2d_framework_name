package com.example.demo.controller;
import java.util.Random;


public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	static void kadaiA() {


		for(int i = 0; i < 10; i++) {
				System.out.println("現在"+ i + "回目のループです。");	}

		}





		static void kadaiB() {
	//ここに課題を書く。メソッド名変えてね
			Random rnd = new Random();
			System.out.println(rnd.nextInt(99)+1+"が出ました。");
		}
}

