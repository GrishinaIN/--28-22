import java.util.ArrayList;
import java.util.List;
import java.lang.*;
class MergeSortedList {
    public static void main(String[] args) {
        List<Student3> list1 = new ArrayList<>();
        list1.add(new Student3("John", 20));
        list1.add(new Student3("Alice", 19));
        list1.add(new Student3("Bob", 21));

        List<Student3> list2 = new ArrayList<>();
        list2.add(new Student3("David", 22));
        list2.add(new Student3("Emily", 18));
        list2.add(new Student3("Charlie", 20));

        List<Student3> mergedList = mergeSortedList(list1, list2);
        System.out.println("Merged and sorted list:");
        for (Student3 student : mergedList) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }

    public static List<Student3> mergeSortedList(List<Student3> list1, List<Student3> list2) {
        List<Student3> mergedList = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            Student3 student1 = list1.get(i);
            Student3 student2 = list2.get(j);

            if (student1.getAge() <= student2.getAge()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
