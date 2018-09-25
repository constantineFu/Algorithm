package cqu.edu.cn.dataStructure.LinkedList;

public class MergeSort {

	/**
	 * 归并排序--合并
	 * @param args
	 */
	public static void merge(Number []a,int lo,int mid,int hi) {
		int i=lo;
		int length=a.length;
		int j=mid+1;
		Number aux[] = new Number[length];
		for(int k=lo;k<=hi;k++) {
			aux[k]=a[k];
		}
		for(int k=lo;k<=hi;k++) {
			if(i>mid) {
				a[k]=aux[j++];
			}else if(j>hi) {
				a[k]=aux[i++];
			}else if(aux[i].doubleValue()<aux[j].doubleValue()) {
				a[k]=aux[i++];
			}else {
				a[k]=aux[j++];
			}
		}
		
	}
	/**
	 * 归并排序--自顶向下方法
	 * @param a
	 */
	public static void sort(Number []a) {
		sort(a,0,a.length-1);
	}
	public static void sort(Number []a,int lo,int hi) {
		if(lo>=hi) return;
		int mid =(lo+hi)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a, lo, mid, hi);
	}
	/**
	 * 归并排序--自底向上
	 * @param a
	 */
	public static void sort2(Number []a) {
		int length=a.length ;
		for(int sz=1;sz<length;sz*=2) {
			for(int lo=0;lo<length-sz;lo+=2*sz) {
				merge(a, lo, lo+sz-1, Math.min(length-1, lo+sz+sz-1));
			}
		}
	}
	public static void main(String[] args) {
		Integer s1[]= {10,9,8,7,6,5,43,3,2,4,5,2};
		sort2(s1);
		for(Integer i:s1) {
			System.out.println(i);
		}
	}

}
