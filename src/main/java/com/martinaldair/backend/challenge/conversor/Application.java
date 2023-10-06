package com.martinaldair.backend.challenge.conversor;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.martinaldair.backend.challenge.conversor.view.ConversorFrame;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConversorFrame conversorFrame = new ConversorFrame();
		conversorFrame.setVisible(true);
	}

}
