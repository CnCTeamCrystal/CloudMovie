package com.skcc.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.profile.service.ProfileService;
import com.skcc.profile.vo.Profile;

@RestController 
public class ProfileRestController {
	private ProfileService profileService;
	
	public ProfileRestController(ProfileService profileService) {
		this.profileService = profileService;
	}
	

	//상세조회
	@GetMapping("/v1/{username}/profiles")
	public Profile getProfileById(@PathVariable(name="username")String username) {
		return profileService.getProfileByusername(username);
	}
	
}
