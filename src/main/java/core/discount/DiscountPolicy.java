package core.discount;

import core.member.Member;

public interface DiscountPolicy {

    int discount(Member member,int price);

}
