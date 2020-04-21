package com.anandlearn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://googlechromedriver//chromedriver.exe//");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(".//input[@placeholder='First Name']")).sendKeys("Amit");
		driver.findElement(By.xpath(".//input[@placeholder='Last Name']")).sendKeys("singh");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("UP ballia");
		driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("amitsingh12@gmail.com");
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("9450557212");
		Boolean st=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input")).isSelected();
		System.out.println(st);
		
		
			driver.close();
		
		

	}

}
