package cqu.edu.cn.dataStructure.LinkedList;

public  class SimpleSort  {

	/**
	 * —°‘Ò≈≈–Ú
	 */
	public static void selectSort(Number[] a) {
		int len=a.length-1;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-i;j++) {
				if(a[j].doubleValue()>a[j+1].doubleValue()) {
					Number tmp=null;
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
	}
	/**
	 * ≤Â»Î≈≈–Ú
	 * @param args
	 */
	public static void insertSort(Number[] a) {
		int len=a.length;
		for(int i=0;i<len;i++) {
			Number tmp=a[i]; 
			int j=i;
//			for(j=i;j>=1&&a[j].doubleValue()<a[j-1].doubleValue();j--) {
////				Number tmp=null;
////				tmp=a[j-1];
////				a[j-1]=a[j];
////				a[j]=tmp;
//			}
			while(j>0&&tmp.doubleValue()<a[j-1].doubleValue()) {
				j--;
			}
			int m=i;
			while(m>j) {
				a[m]=a[m-1];
				m--;
			}
			a[m]=tmp;
//			if(a[j].doubleValue()<a[j-1].doubleValue()) {
//				j--;
//			}
			
		}
	}
	/**
	 * ≤Â»Î≈≈–Ú
	 * @param args
	 */
	public static void insertSortWithBinary(Number[] a) {
		int len=a.length;
		for(int i=0;i<len;i++) {
			for(int j=i;j>=1&&a[j].doubleValue()<a[j-1].doubleValue();j--) {
				Number tmp=null;
				tmp=a[j-1];
				a[j-1]=a[j];
				a[j]=tmp;
			}
			
		}
	}
	
	/**
	 * œ£∂˚≈≈–Ú
	 * @param args
	 */
	public static void shellSort(Number[] a) {
		int len=a.length;
		for(int gap=len/2;gap>0;gap/=2) {
			for(int j=gap;j<len;j++) {
				System.out.println("j£ª"+j);
				for(int i=j;j>=gap&&a[j].doubleValue()<=a[j-gap].doubleValue();j-=gap) {
					Number tmp=null;
					tmp=a[j-gap];
					a[j-gap]=a[j];
					a[j]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {6,5,54,2,3,1};
		shellSort(a);
		for(Integer i:a) {
			System.out.println(i);
		}
	}

}
