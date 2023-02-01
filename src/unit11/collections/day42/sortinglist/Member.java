package unit11.collections.day42.sortinglist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Member implements Comparable<Member>{
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Member that) {

        return this.name.compareTo(that.name);
    }
}
class MemberListMain{
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>(List.of(new Member("John"),new Member("Kim"),new Member("Brad"),new Member("George")));
        System.out.println(memberList);
        memberList.sort(Comparator.naturalOrder());
        System.out.println(memberList);

    }

}
