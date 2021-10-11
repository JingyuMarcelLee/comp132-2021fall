import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ClassAndGPA implements Comparable<ClassAndGPA>{

	int classYear;
	double gpa;
	
	public ClassAndGPA( int year, double gpa) {
		classYear = year;
		this.gpa = gpa;
	}
	
	public String toString() {
		return "class "+classYear + " gpa " + gpa;
	}
	
	@Override
	public int compareTo(ClassAndGPA o) {
		if( this.classYear < o.classYear) {
			return -1;
		}else if( this.classYear == o.classYear) {
			if( this.gpa < o.gpa) {
				return -1;
			}else if (this.gpa == o.gpa) {
				return 0;
			}else {
				return 1;
			}
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<ClassAndGPA> list = new ArrayList<>();
		for(int i = 0; i < 10; ++i) {
			list.add(new ClassAndGPA(rnd.nextInt(4), rnd.nextDouble()*4));
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		ClassAndGPAByGPAComparator comp = new ClassAndGPAByGPAComparator();
		Collections.sort( list, comp);
		System.out.println(list);
	}

}
