package com.example.tests;

import org.testng.annotations.Test;

public class AlsoGroupCreationTests extends TestBase {
	
	
  @Test(enabled = false)
  	public void testNonEmptyGroupCreation() throws Exception {
	  app.navigateTo().mainPage();
	  app.navigateTo().groupsPage();
	  app.getGroupHelper().initGroupCreation();
	  GroupData group = new GroupData();
	 // group.name = "group name 1";
	 // group.header = "header 1";
	 // group.footer = "footer 1";
	  app.getGroupHelper().fillGroupForm(group);
	  app.getGroupHelper().submitGroupCreation();
	  app.getGroupHelper().returnToGroupPage();
  	}
  
  @Test(enabled = false)
	public void testEmptyGroupCreation() throws Exception {
	  app.navigateTo().mainPage();
	  app.navigateTo().groupsPage();
	  app.getGroupHelper().initGroupCreation();
	  app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
	  app.getGroupHelper().submitGroupCreation();
	  app.getGroupHelper().returnToGroupPage();
	}
  	
}
