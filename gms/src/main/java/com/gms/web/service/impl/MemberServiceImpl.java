package com.gms.web.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberMapper mapper;

	@Override
	public void add(MemberDTO p) {
		logger.info("---add() :p: {}---", p);
		mapper.insert(p);
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		logger.info("---list() :p: {}---", p);
		return mapper.selectList(p);
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		logger.info("---search() :p: {}---", p);
		return mapper.selectSome(p);
	}

	@Override
	public MemberDTO retrieve(MemberDTO p) {
		logger.info("---retrieve() :p: {}---", p);
		return mapper.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		logger.info("---count() :p: {}---", p);
		return mapper.count(p);
	}

	@Override
	public void modify(MemberDTO p) {
		logger.info("---modify() :p: {}---", p);
		mapper.update(p);
	}

	@Override
	public void remove(MemberDTO p) {
		logger.info("---remove() :p: {}---", p);
		mapper.delete(p);
	}

	@Override
	public boolean login(MemberDTO p) {
		logger.info("---login() :p: {}---", p);
		return mapper.login(p).equals("1");
	}
	

}
