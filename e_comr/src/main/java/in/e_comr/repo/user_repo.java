package in.e_comr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import in.e_comr.model.user;

@Repository
public interface user_repo extends JpaRepository<user, Long> {

    user findByUsername(String username);
	}

