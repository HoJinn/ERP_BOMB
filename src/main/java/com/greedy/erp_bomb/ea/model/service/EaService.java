package com.greedy.erp_bomb.ea.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greedy.erp_bomb.ea.model.dao.EaDAO;
import com.greedy.erp_bomb.ea.model.dto.AddendumDTO;
import com.greedy.erp_bomb.ea.model.dto.EADTO;
import com.greedy.erp_bomb.member.model.dto.MemberDTO;

@Service
public class EaService {
	
	private EaDAO eaDAO;
	
	@Autowired
	public EaService(EaDAO eaDAO) {
		this.eaDAO = eaDAO;
	}

	@Transactional
	public List<EADTO> findMyEa(String userName) {
		return eaDAO.findMyEa(userName);
	}

	@Transactional
	public List<EADTO> findMyEaPathList(String userName) {
		return eaDAO.findEaPathList(userName);
	}

	@Transactional
	public List<EADTO> findMyEaCarbonList(String userName) {
		return eaDAO.findEaCarbonList(userName);
	}

	@Transactional
	public List<MemberDTO> findMemberList() {
		return eaDAO.findMemberList();
	}

	@Transactional
	public void insertEa(EADTO ea) {
		eaDAO.insertEa(ea);
	}

	@Transactional
	public void deleteAddendum(int no) {
		eaDAO.deleteAddendum(no);
	}

	@Transactional
	public AddendumDTO replyAddendum(AddendumDTO replyAd) {
		return eaDAO.replyAddendum(replyAd);
	}
}
