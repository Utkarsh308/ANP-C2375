package Exampl.View;

import javax.swing.Action;

import Example.service.Addition;

public class main {
	public main(String args[]) {
		Action obj = (Action) new Addition();
		System.out.println(((Addition) obj).add(5));
		System.out.println(((Addition) obj).add(5, 5.6));
		System.out.print(((Addition) obj).add(5,7));
	}

}
