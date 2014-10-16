package com.example.tests;

import org.testng.annotations.Test;

public class AlsoCreationTests extends TestBase {
	
  @Test
  	public void testNonEmptyGroupCreation() throws Exception {
	  openMainPage();
	  gotoGroupsPage();
	  initGroupCreation();
	  GroupData group = new GroupData();
	  group.name = "group name 1";
	  group.header = "header 1";
	  group.footer = "footer 1";
	  fillGroupForm(group);
	  submitGroupCreation();
	  returnToGroupPage();
  	}
  
  @Test
	public void testEmptyGroupCreation() throws Exception {
	  openMainPage();
	  gotoGroupsPage();
	  initGroupCreation();
	  fillGroupForm(new GroupData("", "", ""));
	  submitGroupCreation();
	  returnToGroupPage();
	}
  	
}
