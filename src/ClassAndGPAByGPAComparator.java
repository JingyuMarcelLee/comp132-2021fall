import java.util.*;
public class ClassAndGPAByGPAComparator implements Comparator<ClassAndGPA>{

	

	@Override
	public int compare(ClassAndGPA o1, ClassAndGPA o2) {
		if( o1.gpa < o2.gpa) {
			return -1;
		}else if ( o1.gpa == o2.gpa) {
			return 0;
		}else {
			return 1;
		}
	}

	

}
