package in.e_comr.service;

import org.springframework.beans.factory.annotation.Autowired;


import in.e_comr.model.user;

import in.e_comr.repo.user_repo;


public class userservice {
	

	    @Autowired
	    private user_repo repo;

	    public user register(user user) {
	        return repo.save(user);
	    }

	    public user findByUsername(String username) {
	        return repo.findByUsername(username);
	    }
	}


