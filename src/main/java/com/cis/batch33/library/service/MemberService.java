package com.cis.batch33.library.service;

import com.cis.batch33.library.model.Member;
import java.security.SecureRandom;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class MemberService {

    private Map<Long, Member> memberMap = new HashMap<>();

    public Member createMember(Member member){

        // call the database
        Long memberId = new SecureRandom().nextLong();
        member.setMemberId(memberId);
        memberMap.put(memberId, member);
        return  member;
    }

    public Member getMember(Long memberId) {
    return memberMap.get(memberId);

    }
}
