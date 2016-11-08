package com.bupt.leetcode41_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L56 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Interval> intervals=new ArrayList<Interval>();
		Interval interval=new Interval(1, 3);
		intervals.add(interval);
		System.out.println(merge(intervals));
	}

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> res=new ArrayList<Interval>();
		if(intervals.size()==0) return res;
		
		Collections.sort(intervals, new myComparator());
		
		int start=intervals.get(0).start;
		int end=intervals.get(0).end;
		for(int i=0;i<intervals.size();i++){
			Interval interval=intervals.get(i);
			if(interval.start>end){
				res.add(new Interval(start, end));
				start=interval.start;
				end=interval.end;
			}else {
				end=Math.max(end, interval.end);
			}
		}
		res.add(new Interval(start, end));
		return res;
	}
	
	public static class myComparator implements Comparator<Interval>{
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start-o2.start;
		}
	}
	
}
