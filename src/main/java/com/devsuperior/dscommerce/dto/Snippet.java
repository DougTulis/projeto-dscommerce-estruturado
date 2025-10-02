package com.devsuperior.dscommerce.dto;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class Snippet {
	public static void main(String[] args) {
		throw new UsernameNotFoundException("Email not found");
		
	}
}

