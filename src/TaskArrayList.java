import java.util.ArrayList;

public class TaskArrayList {
	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("Sumeyra");
		arrayList.add("Hafsa");
		arrayList.add("Hasan");
		arrayList.add("Azra");
		arrayList.add("Kaptan");
		
		int size=arrayList.size();
		System.out.println(size);
		System.out.println("-->-->-->-->-->-->-->-->");
		for(String str:arrayList ) {
			System.out.println(str);
			
			
		}
		System.out.println("********************");
		for(int num=0;num<arrayList.size();num++) {
			System.out.println(arrayList.get(num));
		}
		System.out.println("//////////////////////////");
			ArrayList alist=new ArrayList();
			alist.add("Hello");
			alist.add(100);
			alist.add(10.10);
			
			//int y=alist.get(1)
			System.out.println(alist);

		
		
	}
}

//ArrayList can Generic and non-Generic
//Non Generic



