package hashing;

public class hasingtest {
	public static void main(String[] args) {
		linkedlist[] hashtab=new linkedlist[5];
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i]=new linkedlist();
		}
		int []arr= {23,267,47,19,48,28,937,456,389};
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i]%hashtab.length;
			hashtab[pos].addatstart(arr[i]);
			
		}
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i].displaydata();
		}
		int searchnum=23;
		int pos=searchnum%hashtab.length;
		System.out.println("searnch num " +pos);
		if(hashtab[pos].search(searchnum)) {
			System.out.println("number exists " +searchnum);
		}
		else {
			System.out.println("no does not exist");
		}
		
			
		
	
	
		
}
	

}
