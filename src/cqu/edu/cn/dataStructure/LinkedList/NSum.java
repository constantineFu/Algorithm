package cqu.edu.cn.dataStructure.LinkedList;

import java.util.Arrays;

public class NSum {

	public static int twoSum(int []a) {
		Arrays.sort(a);
		int N=a.length;
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(Arrays.binarySearch(a, -a[i])>i) {
				cnt++;
			}
		}
		return cnt;
	}
	public static int threeSum(int []a) {
		Arrays.sort(a);
		int N=a.length;
		int cnt=0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				if(Arrays.binarySearch(a, -a[i]-a[j])>j) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int []a= {1,-1,2,-1,-1};
		System.out.println(threeSum(a));

	}

}
