package com.cis.batch33.library.service;

import com.cis.batch33.library.model.Member;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class MemberService {

    private Map<Long, Member> memberMap = new HashMap<>();

    public Member createMember(Member member){

        // call the database
        Long memberId = new Random().nextLong();
        member.setMemberId(memberId);
        memberMap.put(memberId, member);
        return  member;
    }
    public Member getMember(Long memberId) {
        return memberMap.get(memberId);
    }
    public Member updateMember(Long memberId, Member updatedMember) {
        if (memberMap.containsKey(memberId)) {
            // Simulating database update
            updatedMember.setMemberId(memberId);
            memberMap.put(memberId, updatedMember);
            return updatedMember;
        }
        return null; // Member not found for the given memberId
    }

    public void deleteMember(Long memberId) {
        memberMap.remove(memberId);
        // Simulating database delete
    }
}