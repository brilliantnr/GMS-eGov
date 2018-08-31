package com.gms.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		//--------------------Age-----------------//
		
				SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
				Date today = new Date();
				String toDate = date.format(today);
				String ssn = p.getSsn();
				
				int toYear = Integer.parseInt(toDate.split("/")[0]);
				int toMonth = Integer.parseInt(toDate.split("/")[1]);
				int toDay = Integer.parseInt(toDate.split("/")[2]);
				
				int birYear = Integer.parseInt(ssn.substring(0, 2));
				int birMonth = Integer.parseInt(ssn.substring(2, 4));
				int birDay = Integer.parseInt(ssn.substring(4, 6));
			
				birYear = birYear>18&&birYear<=99 ? 
						Integer.parseInt("19"+String.valueOf(birYear))
						:
						Integer.parseInt("20"+String.valueOf(birYear));

				int age = ((birMonth*100+birDay)>(toMonth*100+toDay))? toYear-birYear+1:toYear-birYear;
				p.setAge(String.valueOf(age));
				
				//--------------------Gender-----------------//
				char genderNum = ssn.charAt(7);
				String gender="";

				if(genderNum=='1'||genderNum=='3'){
					gender="남자";
				}else if(genderNum=='2'||genderNum=='4'){
					gender="여자";
				}else if(genderNum=='5'||genderNum=='6'){
					gender="외국인";
				}	
				p.setGender(gender);	
				
				System.out.println("age : "+age+" gender :"+gender);
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
