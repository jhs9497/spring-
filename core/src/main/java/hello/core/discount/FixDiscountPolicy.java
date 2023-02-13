package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

	private int discountFIxAmount = 1000; // 1000원 할인
	
	@Override
	public int discount(Member member, int price) {
		// TODO Auto-generated method stub
		if(member.getGrade() == Grade.VIP) {
			return discountFIxAmount;
		} else {
			return 0;
		}
		
	}

}
