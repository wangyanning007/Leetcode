package com.bupt.leetcode221_240;

import java.awt.peer.SystemTrayPeer;

public class L223 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=0, B=0, C=0, D=0, E=-1, F=-1, G=1,H=1;
		System.out.println(computeArea(A, B, C, D, E, F, G, H));
	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {

		if(C<E||A>G||B>H||D<F) return (C-A)*(D-B)+(G-E)*(H-F);
		int left_x=A>E?A:E;
		int right_x=C>G?G:C;
		int top_y=D>H?H:D;
		int bottom_y=B>F?B:F;
		return (C-A)*(D-B)+(G-E)*(H-F)-(right_x-left_x)*(top_y-bottom_y);
	}

}
