package com.cis.batch33.library.controller;

import com.cis.batch33.library.entity.Member;
import com.cis.batch33.library.model.MemberDTO;
import com.cis.batch33.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/{memberId}")
    public MemberDTO getMember(@PathVariable int memberId){
        return memberService.getMember(memberId);
    }

    // create a member
    @PostMapping
    public Member createMember(@RequestBody Member member){
        return memberService.createMember(member);
    }

    // Update a member
    @PutMapping("/{memberId}")
    public Member updateMember(@PathVariable int memberId, @RequestBody Member updatedMember) {
        return memberService.updateMember(memberId, updatedMember);
    }

    // Delete a member by memberId
    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable int memberId) {
        memberService.deleteMember(memberId);
    }
}
