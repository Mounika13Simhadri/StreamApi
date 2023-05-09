package stream_api;

import java.util.*;
import java.util.stream.Stream;

public class StreamObjectCreation {

	public static void main(String[] args) {
		
		//Creating empty string..empty() is used to avoid returning null 
		Stream<String> stream = Stream.empty();
		stream.forEach(System.out::println);

		Collection<String> collection=Arrays.asList("ABC","DEF","PQR","XYZ");
		Stream<String> stream1=collection.stream();
		stream1.forEach(System.out::println);
		
		List<String> list=Arrays.asList("ABC","DEF","PQR","XYZ");
		Stream<String> stream2=list.stream();
		stream2.forEach(s2->System.out.print(s2+","));
		System.out.println();
		
		Set<String> set=new HashSet<>(list);
		Stream<String> stream3=set.stream();
		stream3.forEach(s2->System.out.print(s2+":"));
		
       

		
	}

}
