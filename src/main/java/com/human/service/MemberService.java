package com.human.service;

import java.util.List;

import com.human.vo.MemberVO;

public interface MemberService {
	public void MemberInsert(MemberVO memberVO) throws Exception;
	public List<MemberVO> MemberSelect() throws Exception;
	public MemberVO MemberView(String userid) throws Exception;
	public void memberUpdate(MemberVO memberVO) throws Exception;
	public void memberDelete(String userid) throws Exception;
}

