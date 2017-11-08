package kr.or.dgit.mybatis_dev.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.service.AddressService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 이름순으로 실행
public class TestAddressService {
	private static AddressService addressService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addressService = new AddressService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		addressService = null;
	}

	@Test
    public void testAFindAddressByAll(){
        RowBounds rowBounds = new RowBounds(0, 3);
        List<Address> lists = addressService.findAddressByAll(rowBounds);
        Assert.assertNotNull(lists);
    }

    @Test
    public void testBFindAddressByAllWithAPI(){
        RowBounds rowBounds = new RowBounds(0, 3);
        List<Address> lists = addressService.findAddressByAllWithAPI(rowBounds);
        Assert.assertNotNull(lists);
    }


}
