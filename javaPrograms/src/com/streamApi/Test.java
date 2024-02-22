package com.streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class People{
	private int id;
	private String  name;
	private int age;
	
	public People() {
		
	}

	public People(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
public class Test {
    public static void main(String[] args) {
//    List<String> list=Arrays.asList("avinasg","nikita","nishanth");
//    List<String> names=list.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
//    names.forEach(System.out::println);
//    
    List<People> pp=Arrays.asList(new People(1,"avin",31),
    		new People(1,"avinassh",30),
    		new People(1,"nikita",29),
    		new People(1,"kamles",28),
    		new People(1,"githa",28)  );
    
    Map<Integer, List<People>>nn=pp.stream().collect(Collectors.groupingBy(People::getAge));
    nn.forEach((key,value)->{
    	System.out.println("key"+key);
    	value.forEach(System.out::println);
    });
    
	/*
	 * pp.stream().filter(s->s.getAge()>28).forEach(System.out::println);
	 * 
	 * List<String>
	 * name=pp.stream().filter(s->s.getAge()==29).map(People::getName).collect(
	 * Collectors.toList()); System.out.println(name);
	 * 
	 * Integer count=pp.stream().map(s->s.getAge()).reduce(0,Integer::sum);
	 */
	/*
	 * People po=pp.stream().max((p1,p2)->p1.getAge()>p2.getAge()?1:-1).get();
	 * System.out.println(po);
	 * 
	 * List<String>
	 * nn=pp.stream().filter(s->s.getName().startsWith("a")).map(People::getName).
	 * collect(Collectors.toList()); Map<String, Integer>
	 * ff=pp.stream().collect(Collectors.toMap(p->p.getName(),p->p.getAge()));
	 * ff.forEach((key,value)->{ System.out.println("key--"+key+"value--"+value);
	 * });
	 * 
	 * 
	 * int[][] arr= {{1,2,3},{4,5,6}}; IntStream f=
	 * Arrays.stream(arr).flatMapToInt(s->Arrays.stream(s));
	 * f.forEach(System.out::println); int[] dd= {1,2,3,4,5,6};
	 * 
	 * Integer vv=Arrays.stream(dd).boxed().max((a,b)->a<b?1:-1).get();
	 * System.out.println(vv);
	 */
             
             
}
}
