package com.skcc.profile.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.skcc.profile.dao.ProfileMapper;
import com.skcc.profile.vo.Profile;

@Service
public class ProfileService {

	private ProfileMapper profileMapper;
	
	public ProfileService(ProfileMapper profileMapper){
		this.profileMapper = profileMapper;
	}
	
	public Profile getProfileByusername(String username){
		return profileMapper.selectProfileByusername(username);
	}
	

}


