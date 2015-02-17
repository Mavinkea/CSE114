//Aril Mavinkere, 109681869
import java.util.Scanner;
import java.util.ArrayList;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Game24 {
	
	private static String[] opCombs={ "+++", "++-", "++*", "++/", "+-+", "+--", "+-*", "+-/",
			 "+*+", "+*-", "+**", "+*/", "+/+", "+/-", "+/*", "+//",
			 "-++", "-+-", "-+*", "-+/", "--+", "---", "--*", "--/",
			 "-*+", "-*-", "-**", "-*/", "-/+", "-/-", "-/*", "-//",
			 "*++", "*+-", "*+*", "*+/", "*-+", "*--", "*-*", "*-/",
			 "**+", "**-", "***", "**/", "*/+", "*/-", "*/*", "*//",
			 "/++", "/+-", "/+*", "/+/", "/-+", "/--", "/-*", "/-/",
			 "/*+", "/*-", "/**", "/*/", "//+", "//-", "//*", "///"};
	
	private static ScriptEngineManager mgr = new ScriptEngineManager();
	private static ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	public static void main(String[] args){		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter four numbers seperated by spaces(between 1 and 9)");
		ArrayList<Double> inputNums=new ArrayList<Double>(4);
		for(int i=0;i<4;i++){
			inputNums.add(i,input.nextDouble());
		}
		
		ArrayList<ArrayList<Double>> perms= permutations(inputNums);
		ArrayList<String> solutions=new ArrayList<String>();
		for(ArrayList a:perms){
			try{
				solutions.addAll(solutionsNoParenth(a));
				solutions.addAll(solutionsParenth1(a));
				solutions.addAll(solutionsParenth2(a));
				solutions.addAll(solutionsParenth3(a));
				solutions.addAll(solutionsParenth4(a));
				solutions.addAll(solutionsParenth5(a));
				solutions.addAll(solutionsParenth6(a));
			}catch(ScriptException e){
				//System.out.println("Invalid input");
			};
		}
		if(solutions.isEmpty()){
			System.out.println("NO SOLUTION for input");
		}
		else{
			for(int i=0;i<solutions.size();i++){
				System.out.println(solutions.get(i));
			}
		}
		
		input.close();
	}
	
	
	public static ArrayList<ArrayList<Double>> permutations(ArrayList<Double> a){
		ArrayList<ArrayList<Double>> perms=new ArrayList<ArrayList<Double>>();
		if(a.isEmpty()){
			ArrayList<Double> onePerm=new ArrayList<Double>();
			perms.add(onePerm);
			return perms;
		}
		for(Double oneE:a){
			ArrayList<Double> b=(ArrayList<Double>)(a.clone());
			b.remove(oneE);
			ArrayList<ArrayList<Double>> perms2=permutations(b);
			for(ArrayList<Double> onePerm:perms2){
				onePerm.add(oneE);
				perms.add(onePerm);
			}
		}
		return perms;
	}
	 
	public static ArrayList<String> solutionsNoParenth(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb=Double.toString(d.get(0))+s.charAt(0)+Double.toString(d.get(1))+
					s.charAt(1)+Double.toString(d.get(2))+s.charAt(2)+Double.toString(d.get(3));
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}
	
	public static ArrayList<String> solutionsParenth1(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb="("+Double.toString(d.get(0))+s.charAt(0)+Double.toString(d.get(1))+")"+
					s.charAt(1)+Double.toString(d.get(2))+s.charAt(2)+Double.toString(d.get(3));
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}
	
	public static ArrayList<String> solutionsParenth2(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb=Double.toString(d.get(0))+s.charAt(0)+"("+Double.toString(d.get(1))+
					s.charAt(1)+Double.toString(d.get(2))+")"+s.charAt(2)+Double.toString(d.get(3));
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}

	public static ArrayList<String> solutionsParenth3(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb=Double.toString(d.get(0))+s.charAt(0)+Double.toString(d.get(1))+
					s.charAt(1)+"("+Double.toString(d.get(2))+s.charAt(2)+Double.toString(d.get(3))+")";
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}

	public static ArrayList<String> solutionsParenth4(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb="("+Double.toString(d.get(0))+s.charAt(0)+"("+Double.toString(d.get(1))+
					s.charAt(1)+Double.toString(d.get(2))+")"+")"+s.charAt(2)+Double.toString(d.get(3));
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}

	public static ArrayList<String> solutionsParenth5(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb="("+Double.toString(d.get(0))+s.charAt(0)+"("+"("+Double.toString(d.get(1))+
					s.charAt(1)+Double.toString(d.get(2))+")"+s.charAt(2)+Double.toString(d.get(3))+")";
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}
	
	public static ArrayList<String> solutionsParenth6(ArrayList<Double> d) throws ScriptException{
		ArrayList<String> solutions=new ArrayList<String>();
		for(String s:opCombs){
			String oneComb="("+Double.toString(d.get(0))+s.charAt(0)+Double.toString(d.get(1))+")"+
					s.charAt(1)+"("+Double.toString(d.get(2))+s.charAt(2)+Double.toString(d.get(3))+")";
			double sol= (double)engine.eval(oneComb);
			if(sol>=23.9 && sol<=24.1){
				solutions.add(oneComb);
			}
		}
		return solutions;
	}
}