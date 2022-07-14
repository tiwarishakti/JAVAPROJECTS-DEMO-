class Student{
	int reg;
	String name;
	Student(int regno,String stuname){
		this.reg=regno;
		this.name=stuname;
	}
}
public class s12studentsclass {

	public static void main(String[] args) {
		Student[] arr;
		arr = new Student[3];
		arr[0]=new Student(12,"aman");
		arr[1]=new Student(13,"naman");
		arr[2]=new Student(14,"chaman");
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i =0; i<arr.length; i++) {
			System.out.println("student with registration no. ="+arr[i].reg+"and name ="+ arr[i].name);
		}

	}

}
