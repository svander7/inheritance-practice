package com.coderscampus.base;

public class NormalUser extends User {

	public NormalUser() {
        this.setReadAccess(true);
        this.setWriteAccess(true);
        this.setSuperUser(false);
    }
}
