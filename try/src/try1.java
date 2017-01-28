import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.text.DateFormatSymbols;
import java.util.Arrays;

import static java.nio.file.StandardWatchEventKinds.*;

import java.util.Calendar;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import acme.module.Colors;
import acme.module.Car;
import collEctions.*;
import generics.Demo;
import generics.bnddandUnbounded;
import generics.intro;
import preferences.*;
public class try1{
	private Path path=null;
	private WatchService watchService =null;
	String time;
	boolean alarmOn;
	/**
	 * <ul>
	 * <li>time is initialized to 12am
	 * <li>alarmOn is initialized to false
	 * </ul>
	 */
	public try1(){
		time="12:00am";
		alarmOn=false;		
	}
	
	public static int calcInt(int a,int b)throws Exception{
		return a+b;
	}
	/**
	 * @deprecated as of release 1/8/1 replaced by {@link #getMyMethod()}
	 * @return
	 */
	public int myMethod(){
		return getMyMethod();
	}
	public int getMyMethod(){
		return 0;
	}
	private void init(){
		path=Paths.get("C:\\Users\\Sharath\\Downloads");
		try{
			watchService = FileSystems.getDefault().newWatchService();
			path.register(watchService,ENTRY_CREATE,ENTRY_DELETE,ENTRY_MODIFY);
		}
		catch(IOException e){
			System.out.println("IOException "+e.getMessage());
		}
	}
	/**
	 * 
	 */
	private void doRounds(){
		WatchKey key=null;
		while(true){
			try{
				key=watchService.take();
				for(WatchEvent<?> event :key.pollEvents()){
					Kind<?> kind =event.kind();
					System.out.println("Event on"+event.context().toString()+kind.toString());
				}
			}
				catch(InterruptedException e){
					System.out.println("Interrupted Exception"+e.getMessage());
				}
				boolean reset = key.reset();
				if(!reset)break;
			}
		}
	
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		System.out.printf("%,8.2f\n",200.234);
		Scanner in = new Scanner(new File("C:\\Users\\Sharath\\Downloads\\file.txt"));
		Scanner in2 = new Scanner(Paths.get("C:\\Users\\Sharath\\Downloads\\file.txt"));
		while(in.hasNext()){
			System.out.println(in.nextLine());
		}
		/*PrintWriter out=new PrintWriter("C:\\Users\\Sharath\\Downloads\\file.txt");
		out.append("hey");*/
		read_data:
			while(true){
				for(int i=0;i<10;i++){
					System.out.println(i);
					if(i==6){
						break read_data;
					}
				}
			}
		int[] a= new int[100];
		a[0]=2;
		for(int e:a){
			if(e!=0)
			System.out.println(e);
		}
		System.out.println(new int[]{10,20,30,40}.toString());
		int k=6,n=8;
		int bin=1;
		for(int i=1;i<=k;i++){
			bin=bin*(n-i+1)/i;
			System.out.println(bin);
		}
		System.out.println(bin);
		GregorianCalendar cal=new GregorianCalendar(2000,Calendar.SEPTEMBER,19);
		//int firstdayofweek=cal.getFirstDayOfWeek();
		System.out.println("Day"+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day"+cal.get(Calendar.DAY_OF_WEEK));
		String[] weekdayNames=new DateFormatSymbols().getShortWeekdays();
		System.out.println("Day"+weekdayNames[cal.get(Calendar.DAY_OF_WEEK)]);
		/*try1 monitor = new try1();
		monitor.init();
		monitor.doRounds();
		in.close();
		in2.close();
		Pattern pattern=Pattern.compile("[[^1-5]^mno]ap");	
		Pattern pat = Pattern.compile("[0-1[5-9]]"); //single character class	
		[0-5&&[345]] //intersection(common to both character classes) above was union 
		"(?i)" //vtc ignoring the case
		while(true)
		assert false:"code execution shouldn't reach here";
		control flow invariant - certain location couldn't be used
		internal inv - value is in certain constraint
		class inv - used to assert object state is in certain constraint 
		pre conditions have to be true before methods are invoked
		String regex="\\Glog";
		String data="hello";
		Pattern patwflag=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		(regex,Pattern.UNICODE_CASE | Pattern.COMMENTS);
		patwflag.flags();returns the flags used
		quantifier bat(3) occurance of bat 3 times
		groups are created using () [] for character class {} for special repetition
		Pattern pattern = Pattern.compile("\\b(\\w+) \\1\\b"); //back references and word boundary
		occurence of pattern at precise position you use boundary matchers
		^ $ \bchecks if pattern begins and ends at word boundary
		\B non word boundary \A beginning of the input
		\G the end of the prev match
		\Z the end of the inp but for the final terminator,if any
		\z the end of the inp
		enumeration is a special class which provides type safe imp of constant types
		
		*/
		
		int x=3;
		assert(x>0): "Asserting internal invariants,X";
		Pattern pattern=Pattern.compile("[mno]ap");
		Matcher matcher=pattern.matcher("mapnap");
		matcher.find();
		String output=String.format(""+"found the text \"%s\" beginning at %d and ending at index %d%n",matcher.group(),matcher.start(),matcher.end());
		System.out.println(output);		
		Pattern pat = Pattern.compile("(\\w+).(\\w+)@(\\w+)\\.com");
		Matcher mat = pat.matcher("sharath.raini@yahoo.com");
		mat.find();
		String out=String.format(""+"found the text \"%s\" beginning at"+"index %d and ending at index %d,%n", mat.group(),mat.start(),mat.end());
		System.out.println(out);
		for(Car car:Car.values()){
			System.out.printf("%-10s%-45s%s\n",car,car.getModel(),car.getYear());
		}
		for(Car car:EnumSet.range(Car.Acme, Car.Ford)){
			System.out.printf("\n%-10s%-45s%s\n", car,car.getModel(),car.getYear());
		}
		int[] arr= {2,4,5};
		System.out.println(Arrays.toString(arr));
		String fruits[]=new String[]{"apple","peach","apple","kiwi"};
		List fruList = Arrays.asList(fruits);
		if(fruList.contains("apple")){
			System.out.println("Yes contains apple");
		}
		String[] copyTo=Arrays.copyOfRange(fruits, 0,2);
		
		int array[] = new int[3];
		Arrays.fill(array, 10);
		
		for(int i:array){
			System.out.print(i);
		}
		System.out.println(Arrays.toString(copyTo));
		
		Arrays.sort(fruits);
		for(String temp:fruits){
			System.out.println(temp);
		}
		int ind=Arrays.binarySearch(fruits, "apple");
		System.out.println(ind);
		/**
		 * making object itself comparable to the another object using Comparable interface
		 * class has to implement java.lang.Comparable interface
		 *
		 *instead of comparing its instances if you want to compare based on other objects 
		 *attribute you have to implement Comparator interface
		 */
		user[] users={
			new user(3,"Ro"),
			new user(5,"Jon"),
			new user(2,"Lisa"),
		};
		Arrays.sort(users);
		/*for(user use:users){
			System.out.println(use);
		}*/
		System.out.println("Comparator");
		Arrays.sort(users,new UserSortByName());
		for(user use:users){
			System.out.println(use);
		}
		listexample le=new listexample();
		le.add();
		le.example();
		Demo d=new Demo();
		d.example();
		bnddandUnbounded bnu=new bnddandUnbounded();
		bnu.example();
		intro i1=new intro();
		i1.example();
		collEctions.demo d1=new collEctions.demo();
		d1.example();
		demo2 uu=new demo2();
		uu.example();
		javaIO.demo d2=new javaIO.demo();
		d2.example();
		preferences.propertiees p1=new propertiees();
		p1.example();
		javaIO.ownIO oio=new javaIO.ownIO();
		oio.example();
		javaIO.dem dd=new javaIO.dem();
		dd.example();
	}
	public static void assertionExample(int a){
		assert a>0 && a<=100;
		int b=a+2;//method logic
		assert b>a;
	}
	
}
