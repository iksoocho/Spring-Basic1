package core.order;

import core.discount.DiscountPolicy;
import core.discount.FixDiscountPolicy;
import core.member.Member;
import core.member.MemberRepository;
import core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    
    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy();   -> 추상에도 의존 + 구현체에도 의존 = DIP 위반!
    private final DiscountPolicy discountPolicy;        // 추상에만 의존

    // 생성자 주입 -> OrderServiceImpl 입장에서는 생성자로 주입받기만 할 뿐 구현객체에 대해 전혀 모른다.
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy){
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
