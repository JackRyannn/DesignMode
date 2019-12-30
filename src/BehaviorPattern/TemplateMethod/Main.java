package BehaviorPattern.TemplateMethod;

/**
 * 模版方法 最典型的就是Comparator比较器
 * 含义：我们定义一个算法的骨架，就是模版。在具体使用的时候会修改一些步骤，这些步骤是在子类中实现的。
 * 举例：学生有不同学科的成绩。我们想按照某种成绩排序，但是排序的过程基本一样，都是选一个值，和其他值比较，只是取大还是取小不同，因此我们延迟到子类中实现（这里用匿名类更方便）。
 * 优点：将各个子类的公共步骤提取出来，避免了代码重复。
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("renchao",90,92),new Student("majun",95,89),new Student("yaojie",93,99)};
        Algo<Student> algo = new Algo<Student>();
        Student ret = algo.getExtremum(students, new ICompare<Student>() {
            @Override
            public boolean compare(Student a, Student b) {
                return a.english>b.english;
            }
        });
        System.out.println("根据模版方法得到最值同学的姓名："+ret.name+" 成绩："+ret.english);
    }
}
