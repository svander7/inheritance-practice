package com.coderscampus.base;

public class SuperUser extends User {
	
	public SuperUser() {
        this.setReadAccess(true);
        this.setWriteAccess(true);
        this.setSuperUser(true);
    }
}
