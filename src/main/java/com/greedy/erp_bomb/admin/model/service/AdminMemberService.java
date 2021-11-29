package com.greedy.erp_bomb.admin.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greedy.erp_bomb.admin.model.dao.AdminMemberDAO;
import com.greedy.erp_bomb.inventory.model.dto.CompanyDTO;
import com.greedy.erp_bomb.member.model.dto.DeptDTO;
import com.greedy.erp_bomb.member.model.dto.MemberDTO;
import com.greedy.erp_bomb.member.model.dto.RankDTO;

@Service
public class AdminMemberService {

	private AdminMemberDAO adminMemberDAO;
	
	@Autowired
	public AdminMemberService(AdminMemberDAO adminMemberDAO) {
		this.adminMemberDAO = adminMemberDAO;
	}

	@Transactional
	public List<MemberDTO> findMemberList() {
		return adminMemberDAO.findMemberList();
	}

	@Transactional
	public List<CompanyDTO> findCompanyList() {
		return adminMemberDAO.findCompanyList();
	}

	public List<DeptDTO> findDeptCodeList() {
		return adminMemberDAO.findDeptCodeList();
	}

	public List<RankDTO> findRankCodeList() {
		return adminMemberDAO.findRankCodeList();
	}

}
