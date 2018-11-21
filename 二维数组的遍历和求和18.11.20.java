class a{
	public static void main(String[] args){
		int[][] arr={{1,2,3},{6,5,4,99},{55,66,77}};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
				sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("数组的总和为"+sum);
	}
}