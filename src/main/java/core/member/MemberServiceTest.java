//package core.member;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class MemberServiceTest {
//
//    MemberService memberService = new MemberServiceImpl();
//
//    @Test
//    void join(){
//        Member member = new Member(1L, "memberA", Grade.VIP);
//
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        Assertions.assertThat(member).isEqualTo(findMember);
//
//        System.out.println("new member = " + member.getName());
//        System.out.println("find Member = " + findMember.getName());
//    }
//}
