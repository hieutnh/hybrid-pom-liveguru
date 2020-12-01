package com.liveguru.data;

import commons.DataHelper;

public class DataEndUser {

	public static class Register {
		public static String firstName = DataHelper.getData().getFirstName();
		public static String lastName = DataHelper.getData().getLastName();
		public static String email = DataHelper.getData().getEmail();
		public static String passWord = DataHelper.getData().getPassword();
		public static String company = DataHelper.getData().getCompanyName();
	}

	//Chia ra nhiều class mỗi class 1 data khác nhau
	public static class Login {
		
	}

}
