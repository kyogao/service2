package com.runstone.service.run.test;

public class AppJARVersion {

	private static String APP_VERSION = "1.0.1";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args!=null && args.length >= 1){
			String arg = args[0];
			if(arg.equals("version")){
				System.out.println("JAR Version is "+APP_VERSION);
			}else if(arg.equals("run")){
				//run app here
			}else if(arg.equals("dir")){
				System.out.println(System.getProperty("user.dir"));
			}else if(arg.equals("help")){
				System.out.println("Show some help info here please!");
			}else{
				System.out.println("Please input correct para!");
			}
		}
	}

}
