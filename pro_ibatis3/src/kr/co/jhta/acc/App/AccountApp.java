package kr.co.jhta.acc.App;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.acc.dao.AccountDao;
import kr.co.jhta.acc.vo.AccountVO;

public class AccountApp {
	public static void main(String[] args) throws SQLException {
		AccountDao accDao = new AccountDao();
		AccountVO  accVO = new AccountVO();
		
		// 1번문제 : 새로운 계좌 등록 
		/*accVO.setAccTitle("적금");
		accVO.setAccOwner("김종언");
		accVO.setAccBalance(2000000);
		accVO.setAccRates(0.01);
		
		accDao.addAccountByNew(accVO);*/
		
		// 2번문제 : 계좌번호로 계좌정보 조회하기
		/*accVO = accDao.lookupAccountByInformation(1);
		System.out.println(accVO.getAccNo());
		System.out.println(accVO.getAccTitle());
		System.out.println(accVO.getAccOwner());
		System.out.println(accVO.getAccBalance());
		System.out.println(accVO.getAccRates());
		System.out.println(accVO.getAccCreatedate());*/
		
		// 3번문제 : 예금주로 개설된 모든 계좌정보 조회하기

		/*List<AccountVO> listArr = accDao.lookupAccountByOwner("김종언");
		for (AccountVO accountVO : listArr) {
			System.out.println(accountVO.getAccNo());
			System.out.println(accountVO.getAccTitle());
			System.out.println(accountVO.getAccOwner());
			System.out.println(accountVO.getAccBalance());
			System.out.println(accountVO.getAccRates());
			System.out.println(accountVO.getAccCreatedate());
		}*/
		
		// 4번문제 : 계좌번호로 계좌정보 삭제하기
		// accDao.deleteAccountByNo(2);
		
		// 5번문제 : 개설된 모든 계좌정보 조회하기
		List<AccountVO> listArr2 = accDao.lookupAccountByAll();
		for (AccountVO accountVO : listArr2) {
			System.out.println(accountVO.getAccNo());
			System.out.println(accountVO.getAccTitle());
			System.out.println(accountVO.getAccOwner());
			System.out.println(accountVO.getAccBalance());
			System.out.println(accountVO.getAccRates());
			System.out.println(accountVO.getAccCreatedate());
		}
		
		
		
		
		
	}
}
