package com.kodz.michal.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class InputListener implements ActionListener {
	private File inputFile;
	public void actionPerformed(ActionEvent e) {
		JFileChooser fileopen = new JFileChooser();
//		FileFilter filter = new FileNameExtensionFilter("JPG");
//		fileopen.addChoosableFileFilter(filter);

		int ret = fileopen.showDialog(null, "Open file");

		if (ret == JFileChooser.APPROVE_OPTION) {
			inputFile = fileopen.getSelectedFile();
			System.out.println(inputFile);
		}
	}
	public File getFile() {
		return inputFile;
	}

}
