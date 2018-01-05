package com.mvc.demo;
import javax.swing.SwingUtilities;

import com.mvc.model.Model;
import com.mvc.view.View;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				runApp();
			}
		});
	}
	
	public static void runApp(){
		
		Model model = new Model();
		View view = new View(model);
	}

}
