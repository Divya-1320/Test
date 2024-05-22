package org.pra;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileExamples {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Eclipse downloads\\eclipse\\Java Practices\\FileExamples\\test1\\txt1.txt");
		//f.mkdir();
		//f.createNewFile();
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
//		System.out.println(f.canExecute());
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		
//		File[] list = f.listFiles();
//		for (File l : list) {
//			System.out.println(l);
//		}
		
//		FileUtils.write(f, "divya", true);
//		FileUtils.write(f,"Ganesh", true);
		System.out.println(f.getParentFile());
		System.out.println(f.getAbsolutePath());
		
	}

}
