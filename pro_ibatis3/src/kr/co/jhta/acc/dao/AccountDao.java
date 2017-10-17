package kr.co.jhta.acc.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.acc.Util.IbatisUtils;
import kr.co.jhta.acc.vo.AccountVO;

public class AccountDao {
	
	public void addAccountByNew(AccountVO accVO) throws SQLException {
		IbatisUtils.getSqlMapClient().insert("addAccountByNew", accVO);
	}

	public AccountVO lookupAccountByInformation(int accNo) throws SQLException {
		return (AccountVO) IbatisUtils.getSqlMapClient().queryForObject("lookupAccountByInformation", accNo);
	}
	
	@SuppressWarnings("unchecked")
	public List<AccountVO> lookupAccountByOwner(String accOwner) throws SQLException {
		return  IbatisUtils.getSqlMapClient().queryForList("lookupAccountByOwner", accOwner);
	}
	
	public void deleteAccountByNo(int accNo) throws SQLException {
		IbatisUtils.getSqlMapClient().delete("deleteAccountByNo", accNo);
	}
	
	@SuppressWarnings("unchecked")
	public List<AccountVO> lookupAccountByAll() throws SQLException {
		return  IbatisUtils.getSqlMapClient().queryForList("lookupAccountByAll");
	}
}
