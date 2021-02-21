import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {

    @Test
    public void myTest(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");

        int count=0;
        for (int i=0;i<names.size();i++)
        {
            String actual= names.get(i);
            if(actual.startsWith("A"))
            {
                count++;

            }
            System.out.println(count);

        }



    }
    @Test
    public void streamFilter()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
    //lamda expression
        long c= names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);

        long d = Stream.of("Abhijeet","Don","Alekhya","Adam").filter(s->
        {
            s.startsWith("A");
                    return true;
        }).count();
        System.out.println(d);
        //print all the name in arraylist
        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

    }
    @Test
    public void streamMap()
    { ArrayList<String> names = new ArrayList<String>();
        names.add("man");
        names.add("Don");
        names.add("woman");

        //print names which last letter as "a" with uppercase
        Stream.of("Abhijeet","Don","Alekhya","Adam").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));

        List<String> names1= Arrays.asList("Azhijeet", "Don","Alekhya","Adam", "Rama");
        names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        //merging 2 different list
        Stream<String> newStream =Stream.concat(names.stream(),names1.stream());
        //newStream.forEach(s->System.out.println(s));
        boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    }
    @Test
    public void streamCollect()
    {
        List <String> ls= Stream.of("Abhijeet","Don","Alekhya","Adam").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));

        List <Integer>value=Arrays.asList(1,2,2,7,5,1,9,7);
        //print unique numbers from the array
        //sort the array 3rd index print
        //value.stream().distinct().forEach(s->System.out.println(s));
        List <Integer>li=value.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(ls.get(2));
    }
}
