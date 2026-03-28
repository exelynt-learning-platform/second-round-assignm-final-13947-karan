package in.e_comr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.e_comr.model.user;

import in.e_comr.repo.user_repo;



	@Service
	public class authservice {

	    @Autowired
	    private user_repo repo;

	    public user login(String username, String password) {

	        user u = repo.findByUsername(username);

	        if (u != null && u.getPassword().equals(password)) {
	            return u;
	        }

	        throw new RuntimeException("Invalid credentials");
	    }
	}