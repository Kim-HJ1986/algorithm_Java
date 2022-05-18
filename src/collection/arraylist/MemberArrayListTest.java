package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[ ] args){
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberPark = new Member(1002, "박정원");
        Member memberSon = new Member(1003, "손흥민");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();

    }
}
