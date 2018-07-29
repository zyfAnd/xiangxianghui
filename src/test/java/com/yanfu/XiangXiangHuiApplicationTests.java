package com.yanfu;

import com.yanfu.model.base.BaseInfo;
import com.yanfu.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XiangXiangHuiApplicationTests {

	@Autowired
	HRService hrService;
	@Autowired
	CharityService charityService;
	@Autowired
	private InvestmentService investmentService;
	@Autowired
	private ActivityService activitySrevice;
	@Autowired
	private LawService lawService;
	@Autowired
	private CarService carService;
	@Test
	public void contextLoads() {
	}
    @Test
	public void testHR(){
		List<BaseInfo>baseInfo = hrService.findAll();
		System.out.print(baseInfo.toString());
//		BaseInfo baseInfo  = charityService.findByName("洗脚大世界");
//		System.out.print(baseInfo.toString());
	}

	@Test
	public void testCharity(){
		BaseInfo baseInfo  = charityService.findCharity();
		System.out.print(baseInfo.toString());
	}
	@Test
	public void testInvestment(){
		BaseInfo baseInfo = investmentService.getInvestment();
		System.out.print(baseInfo);
	}

	@Test
	public void testActivity(){
		BaseInfo baseInfo = activitySrevice.getActivities();
		System.out.print(baseInfo);
	}

	@Test
	public void testLawInfo(){
		BaseInfo baseInfo = lawService.getLawInfo();
		System.out.print(baseInfo);
	}
	@Test
	public void testCarIno(){
		BaseInfo baseInfo = carService.getCarInfo();
		System.out.print(baseInfo);
	}
}
