package Datenload_Uebung42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

public class Dataload {

	static File f;

	public static void main(String[] args) {
		
	JFileChooser cho = new JFileChooser();
	int varCho = cho.showSaveDialog(null);
	if (varCho == JFileChooser.APPROVE_OPTION) {
		f = cho.getSelectedFile();
	}else System.out.println("Da ist was schief gelaufen");
	
		String line; 
		try (BufferedReader reader = new BufferedReader ( new InputStreamReader(new FileInputStream(f)))){
			line = reader.readLine();
			if (line != null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			System.out.println("Da ist was schief gelaufen");
		}

	}

}
